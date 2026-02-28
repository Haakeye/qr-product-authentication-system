/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.commondb.Common_DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author h
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     * @param username
     * @param password
     * @param email
     * @param phone
     * @return 
     */
    @WebMethod(operationName = "Register")
    public String Register(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "email") String email, @WebParam(name = "phonenumber") String phone) {
       
        
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        System.out.println(phone);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct", "root", "password");
            PreparedStatement ps = con.prepareStatement("INSERT INTO retailor values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(4, email);
            ps.setString(3, phone);
            ps.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return "Server error";
        }
        
        return "success";        
    }
    
    @WebMethod(operationName = "Login")
  public String Login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
      
        System.out.println(username);
        System.out.println(password);
    try{      
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("Select * from retailor where username='"+username+"' and password='"+password+"' ");
        System.out.println("Enter in loop");
     if(rs.next())
     {
         return "success";
         
     }
     else{
         
    return "server error";
     }
     
    
    }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return "internal server error";
       
  }
  
  //**Distirbutor Login and Registration code**//
  
  /**
     * This is a sample web service operation
     * @param username
     * @param password
     * @param email
     * @param phone
     * @return 
     */
    @WebMethod(operationName = "DRegister")
    public String DRegister(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "email") String email, @WebParam(name = "phonenumber") String phone) {
       
        
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        System.out.println(phone);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct", "root", "password");
            PreparedStatement ps = con.prepareStatement("INSERT INTO dist values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(4, email);
            ps.setString(3, phone);
            ps.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return "Server error";
        }
        
        return "success";        
    }
    
    @WebMethod(operationName = "DLogin")
  public String DLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
      
        System.out.println(username);
        System.out.println(password);
    try{      
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("Select * from dist where username='"+username+"' and password='"+password+"' ");
        System.out.println("Enter in loop");
     if(rs.next())
     {
         return "success";
         
     }
     else{
         
    return "server error";
     }
     
    
    }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return "internal server error";
       
  }
  
  
  //Storing the qrvalue and transfer to block chain 
  @WebMethod(operationName = "booked")
  public String booked(@WebParam(name = "qrvalue") String qrvalue, @WebParam(name = "username") String username) throws ClassNotFoundException {
            System.out.println("a: "+qrvalue);
            System.out.println("b: "+username);
      
            long millis=System.currentTimeMillis();  
            java.sql.Date cdate=new java.sql.Date(millis);  
        System.out.println(cdate); 
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct", "root", "password");
            PreparedStatement ps = con.prepareStatement("INSERT INTO approval(qrvalue,username,currentdate) values(?,?,?)");
            ps.setString(1, qrvalue);
            ps.setString(2, username);
            ps.setDate(3, cdate);
            ps.executeUpdate();
        }
        catch(SQLException | NumberFormatException e)
        {
            System.out.println(e);
        }
        return "success";
        
        
        
    } 
  
  @WebMethod(operationName = "getDeviceList1")
     public String getDeviceList1 (@WebParam(name = "transaction") String transaction,@WebParam(name = "username") String username,String method) {
   
         System.out.println(username);
         System.out.println(transaction);
         StringBuilder sb = new StringBuilder();
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery("select * from approval");       
           while(rs.next())
           {    
                String statusnew=rs.getString("qrvalue");
                String langtitude=rs.getString("username");
                String longititude=rs.getString("currentdate");
                
                sb.append("qrvalue: ").append(statusnew);
                sb.append("\n"); 
                sb.append("username: ").append(langtitude);
                sb.append("\n");
                sb.append("Currendate: ").append(longititude);
                sb.append("@");
                
            }
     
               
    }
       catch(ClassNotFoundException | SQLException ex){
         Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE,null,ex);
         return "server temporarily not avilable";
       }
        System.out.println(sb.toString());
        return sb.toString();
        
     }
     
     //user login and Registration part
     @WebMethod(operationName = "ULogin")
  public String ULogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
      
        System.out.println(username);
        System.out.println(password);
    try{      
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("Select * from user where username='"+username+"' and passoword='"+password+"' ");
        System.out.println("Enter in loop");
     if(rs.next())
     {
        return "success";
         
    }
     else
    {         
        return "server error";
    }
     
    
    }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return "internal server error";
       
  }
  
  @WebMethod(operationName = "URegister")
    public String URegister(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "email") String email, @WebParam(name = "phonenumber") String phone) {
       
        
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        System.out.println(phone);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct", "root", "password");
            PreparedStatement ps = con.prepareStatement("INSERT INTO user values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(4, email);
            ps.setString(3, phone);
            ps.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return "Server error";
        }
        
        return "success";        
    }
    
   //verifing the product
     @WebMethod(operationName = "verify")
    public String verify(@WebParam(name = "qrvalue") String qrvalue) {
        System.out.println(qrvalue);
        
        
        
    try{      
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("Select * from approval where qrvalue='"+qrvalue+"' ");
        System.out.println("Enter in loop");
     if(rs.next())
     {
        return "success"; 
    }
     else
    {         
        return "server error";
    }
     
    
    }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return "internal server error";
       
  }
  
  
}
