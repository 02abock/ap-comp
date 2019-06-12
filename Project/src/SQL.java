 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class SQL {
	 static String timeOut=null;
	 static String timein=null;
	 static boolean out=false;
	
	public static void creatTable() {
	String url ="jdbc:sqlite:/ap-comp/project/mydata.db";
    Connection c = null;
    Statement stmt = null;
    
    try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection(url);
       c.setAutoCommit(false);
       System.out.println("Opened database successfully");

       stmt = c.createStatement();
       String sql = "CREATE TABLE IF NOT EXISTS MYDATA ( ID TEXT, Periode TEXT,t1 TEXT,t2 TEXT)" ; 
       stmt.executeUpdate(sql);


       stmt.close();
       c.commit();
       c.close();
    } catch ( Exception e ) {
       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
       System.exit(0);
    }
    System.out.println("table Created succesfully ");
	}
 
    /**
     * Create a new table in the test database
     *
     */
    public static void swipe(String id, String P) {
    	if (out) {
    		
    		Date date = new Date();
    	    String strDateFormat = "hh:mm:ss a";
    	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    	    String formattedDate= dateFormat.format(date);
    	    timein=formattedDate;
		String url = "jdbc:sqlite:/ap-comp/project/mydata.db";
        Connection c = null;
        Statement stmt = null;
        out=false;
        
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection(url);
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           String sql = "INSERT INTO MYDATA(ID,Periode,t1,t2) VALUES(?,?,?,?)";
           
           
           PreparedStatement pstmt = c.prepareStatement(sql); {
               pstmt.setString(1, id);
               pstmt.setString(2, P);
               pstmt.setString(3, timeOut);
               pstmt.setString(4, timein);
               pstmt.executeUpdate();
              
           }


           stmt.close();
           c.commit();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Records created successfully");
     }
    	else {
    		Date date = new Date();
    	    String strDateFormat = "hh:mm:ss a";
    	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    	    String formattedDate= dateFormat.format(date);
    	    timeOut=formattedDate;
    	    out=true;
    	    System.out.println("else");
    	    
    	}
    }
    
    
    public static void test() {
    	String url = "jdbc:sqlite:/ap-comp/project/mydata.db";
        Connection c = null;
        Statement stmt = null;
        
        try {
        	Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(url);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");    
        	stmt  = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID,Periode,t1,t2 FROM MYDATA;");
          while (rs.next()) {
          System.out.println(rs.getString("ID"));
          System.out.println(rs.getString("Periode"));
          System.out.println(rs.getString("t1"));
          System.out.println(rs.getString("t2"));
        }
        
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
		

    }
    
    
    public static String getMaxVal() {
    	
    	
    	String url = "jdbc:sqlite:/ap-comp/project/mydata.db";
        Connection c = null;
        Statement stmt = null;
        
        try {
        	Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(url);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");    
        	stmt  = c.createStatement();
            ResultSet rs    = stmt.executeQuery("SELECT *, max(SCORE) FROM SCOREBOARD;");
            return rs.getInt("SCORE") +  " by " + rs.getString("NAME");
        
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
		return "### by XYZ";

    }
    
  
  
}