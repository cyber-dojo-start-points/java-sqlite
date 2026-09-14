import java.sql.*;

public class Hiker {

    public static void setup() {
        String create_sql = "CREATE TABLE IF NOT EXISTS earth "
            + "(question text NOT NULL,"
            + " answer int"
            + ");";
        String delete_sql = "DELETE FROM earth;";
        String insert_sql = "INSERT INTO earth "
            + " VALUES ('6 * 9', 42);";

        try (Connection connection = DriverManager.getConnection(connectionString);
             Statement statement = connection.createStatement()) {
            statement.execute(create_sql);
            statement.execute(delete_sql);
            statement.execute(insert_sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int answer() {
        while (true) {
        }
    }

    private static String connectionString =
        "jdbc:sqlite:/sandbox/hiker.db";
}
