

import java.sql.*;
import java.util.Properties;

public class Database {

    private Connection con;
    private final String DB_URL = "jdbc:postgresql://localhost:5432/Museums";

    //Driver de JDBC que vamos a usar para conectarnos a la base de datos
    private final String DRIVER = "org.postgresql.Driver";
    private static Database DB = null;

    private Database() {
        super();
    }

    private Database(String user, String password) {
        super();
        con = null;
        try {

            // Cargar el driver
            Class.forName(DRIVER);
            Properties props = new Properties();
            props.setProperty("user", "developer");
            props.setProperty("password", "Patatas23.");
            // Abrir una conexion a la base de datos
            con = DriverManager.getConnection(DB_URL, props);

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Codigo : " + ex.getErrorCode());
        }
    }

    // Abrir la conexión y regresar objeto Database
    public static Database getDatabase(String user, String pass) {
        if (DB == null) {
            DB = new Database(user, pass);
        }
        return DB;
    }

    public String getColumnName(int index, String tablename) {
        Statement stmt;
        ResultSet rs;
        String name = "";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM \""+tablename+"\"");
            ResultSetMetaData rsmd = rs.getMetaData();
            name= rsmd.getColumnName(++index);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }

    public ResultSet query(String sql) throws SQLException {

        ResultSet rs = null;
        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        rs = statement.executeQuery(sql);

        return rs;
    }

    public ResultSet query(String sql, int scroll, int concur) throws SQLException {

        ResultSet rs = null;

        Statement statement = con.createStatement(scroll, concur);
        rs = statement.executeQuery(sql);

        return rs;
    }

    public int update(String sql) throws SQLException {
        int result = -1;

        Statement statement = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                ResultSet.TYPE_FORWARD_ONLY);
        result = statement.executeUpdate(sql);
        return result;
    }
}
