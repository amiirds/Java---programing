import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repository implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;

    Repository()throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1","amirds","ds123");
    }

    public void insert(Entity entity)throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into resturant (address,food,cost) values (?,?,?)");
        preparedStatement.setString(1, entity.getAddress());
        preparedStatement.setString(2, entity.getFood());
        preparedStatement.setString(3, entity.getCost());
        preparedStatement.executeUpdate();
    }
    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();

    }
}
