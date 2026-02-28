package newpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NoobChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<>();
	public static int difficulty = 5;
        static int i =5;
          

	public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		
		try{                   
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fakeproduct","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("Select * from approval");
                    addBlock(new Block("Genius block","o"));
                    while(rs.next()){
                        String qrvalue = rs.getString("qrvalue");
                        String username = rs.getString("username");
                        String currentdate = rs.getString("currentdate");
                        
                        if(rs.next()){                      
                        addBlock(new Block("product details  :  " +qrvalue+"    username :   "+username+ "Current_Date:"+currentdate, blockchain.get(blockchain.size()-1).hash));
                        String blockchainJson = StringUtil.getJson(blockchain);
                        System.out.println("\nThe block chain: ");
                        System.out.println(blockchainJson);
                        }
                        else{
                            
                        }
                    }
                   
                   
                }
                catch(ClassNotFoundException | SQLException e){
                    System.out.println(e);
                }
		
		
	}
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
			
		}
		return true;
	}
	
	public static void addBlock(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockchain.add(newBlock);
	}
}
