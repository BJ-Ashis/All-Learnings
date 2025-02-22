import java.sql.*;
public class Jdbc {
    public static void main(String []args){
        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="BerserkAshis@5432112345";
        String sql="update student set sname='Max' where sid=5";
        try {
//            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            st.execute(sql);

            con.close();

        }
        catch (SQLException e) {
            System.err.println("SQLException: ");
            System.err.println(e.getMessage());
        }


    }
}
