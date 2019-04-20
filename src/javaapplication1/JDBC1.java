package javaapplication1;
import javax.swing.JOptionPane;
import java.sql.*;
public class JDBC1
{
  Connection con=null;
  Statement st=null;
   ResultSet rs=null;
       public JDBC1()
{
try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
 JOptionPane.showMessageDialog(null,"Database Connected","Database Info",-1);
 String sql="SELECT * from user";
 st=con.createStatement();
 rs=st.executeQuery(sql);
 while(rs.next()) {
        
        System.out.println("user Id\t"+ "user name\t"+"password\t"+"email");
        System.out.println("======================================================");
        while(rs.next())
        {
            System.out.print(rs.getString("ID"));
            System.out.print("\t"+rs.getString("1"));
            System.out.print("\t\t"+rs.getString("2"));
            System.out.print("\t\t"+rs.getString("3"));
            System.out.print("\t\t"+rs.getString("4")+"\n");
         rs.close();
         con.close();
         st.close();
        }      
    }
   
}
 catch(ClassNotFoundException e)
{
JOptionPane.showMessageDialog(null,"Connection Failed\n Class Not Found");
}
 catch(SQLException e)
{
  JOptionPane.showMessageDialog(null,"Connection Failed");
}
}
  public static void main(String[] args)
{
 new JDBC1();
}

    
    }


