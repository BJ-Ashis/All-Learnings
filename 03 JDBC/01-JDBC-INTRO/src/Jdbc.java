import java.sql.*;
public class Jdbc {
    public static void main(String []args){
        /*
        import package
        load and register
        create statement
        execute statement
        process the results
        close
        */

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="BerserkAshis@5432112345";
//      String query="select sname from student where sid=1;";
        String query="select * from student;";
        try {
            // Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                System.out.println("Id Of The Student is : "+rs.getInt(1)+
                        " Name Of The Student is : "+rs.getString(2)+
                        " Marks Of The Student is : "+rs.getInt(3));
            }
            con.close();

        }  
        catch (SQLException e) {
            System.err.println("SQLException: ");
            System.err.println(e.getMessage());
        }

    }
}
