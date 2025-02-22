import java.sql.*;
public class Jdbc {
    public static void main(String []args){

        int sid=101;
        String sname="Jhon";
        int marks=48;

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="BerserkAshis@5432112345";
        String sql="insert into student values("+sid+",'"+sname+"',"+marks+")";

        try {
//          Class.forName("org.postgresql.Driver");
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
