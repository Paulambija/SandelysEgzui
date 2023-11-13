import java.sql.*;

public class DatabaseManager {
    String url="jdbc:postgresql://localhost:5432/Sandelys";
    private static final String USERNAME="postgres";
    private static final String PASSWORD="Yaejoota2";
    private Connection connection;

    public DatabaseManager() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

        } catch (SQLException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   /* public void pridetiKlienta(Klientas klientas){
        String query="INSERT INTO Klientai(kliento_id,vardas, pavarde, el_pastas, tel_numeris, registracijos_data) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1, Klientai.getkliento_id());
            preparedStatement.setString(2, Klientai.getvardas());
            preparedStatement.setString(3, Klientai.getpavarde());
            preparedStatement.setDate(4, Klientai.getel_pastas());
            preparedStatement.setString(5, Klientai.gettel_numeris());
            preparedStatement.setString(5, Klientai.getregistracijos_data());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
