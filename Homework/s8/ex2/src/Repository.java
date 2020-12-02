import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public static List<String> users = new ArrayList<>();
    public static List<String> passes = new ArrayList<>();
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds", "ds123");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (id, name, username, password, email) values (?,?,?,?,?)");
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2,"ali");
        preparedStatement.setString(3,"123");
        preparedStatement.setString(4,"123");
        preparedStatement.setString(5,"ali@ds.com");
        preparedStatement.executeUpdate();
        preparedStatement = connection.prepareStatement("insert into users (id, name, username, password, email) values (?,?,?,?,?)");
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"amir");
        preparedStatement.setString(3,"amir");
        preparedStatement.setString(4,"123");
        preparedStatement.setString(5,"123@ds.com");
        preparedStatement.executeUpdate();
        preparedStatement = connection.prepareStatement("insert into users (id, name, username, password, email) values (?,?,?,?,?)");
        preparedStatement.setInt(1,3);
        preparedStatement.setString(2,"asqar");
        preparedStatement.setString(3,"asaqr");
        preparedStatement.setString(4,"123");
        preparedStatement.setString(5,"asqar@ds.com");
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("update users set name=?, username=?, password=?, email=? where id=?");
        preparedStatement.setString(1,entity.getName());
        preparedStatement.setString(2,entity.getUsername());
        preparedStatement.setString(3,entity.getPassword());
        preparedStatement.setString(4,entity.getEmail());
        preparedStatement.setInt(5,entity.getId());
        preparedStatement.executeUpdate();
    }
    public List<Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setName(resultSet.getString("name"));
            entity.setUsername(resultSet.getString("username"));
            entity.setPassword(resultSet.getString("password"));
            entity.setEmail(resultSet.getString("email"));
            entityList.add(entity);
            users.add(resultSet.getString("username"));
            passes.add(resultSet.getString("password"));
        }
        return entityList;
    }
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}