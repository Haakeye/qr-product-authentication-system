/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static newpackage.MyQr.createQR;

/**
 *
 * @author h
 */
public class addproduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addproduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addproduct at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s0=request.getParameter("name");
        String s1=request.getParameter("model");
        String s2=request.getParameter("description");
        
        
        // The data that the QR code will contain
		String data = s0+s1+s2;

		// The path where the image will get saved
		String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\demo.png";

		// Encoding charset
		String charset = "UTF-8";

		Map<EncodeHintType, ErrorCorrectionLevel> hashMap
			= new HashMap<EncodeHintType,
						ErrorCorrectionLevel>();

		hashMap.put(EncodeHintType.ERROR_CORRECTION,
					ErrorCorrectionLevel.L);

        try {
            // Create the QR code and save
            // in the specified folder
            // as a jpg file
            createQR(data, path, charset, hashMap, 200, 200);
        } catch (WriterException ex) {
            Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
        }
		System.out.println("QR Code Generated!!! ");
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
            PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
            ps.setString(1, s0);
            ps.setString(2, s1);
            ps.setString(3, s2);
            ps.executeUpdate();
            response.sendRedirect("manuhome.jsp");
        }
        catch(ClassNotFoundException | SQLException | IOException e)
        {
            System.out.println(e);
        }
    }
    
// Function to create the QR code
	public static void createQR(String data, String path,
								String charset, Map hashMap,
								int height, int width)
		throws WriterException, IOException
	{

		BitMatrix matrix = new MultiFormatWriter().encode(
			new String(data.getBytes(charset), charset),
			BarcodeFormat.QR_CODE, width, height);

		MatrixToImageWriter.writeToFile(
			matrix,
			path.substring(path.lastIndexOf('.') + 1),
			new File(path));
	}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
