import java.sql.*;
public class Jdbc {
    public static void main(String []args){

        int sid=102;
        String sname="Jasmine";
        int marks=52;

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="BerserkAshis@5432112345";
        String sql="insert into student values(?,?,?)";

        try {
//          Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1,sid);
            st.setString(2,sname);
            st.setInt(3,marks);

            st.execute();

            con.close();

        }
        catch (SQLException e) {
            System.err.println("SQLException: ");
            System.err.println(e.getMessage());
        }


    }
}
