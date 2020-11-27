import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds", "ds123");
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement("create table customers (melliID number , name varchar (20), car_name varchar(20), car_year number , car_price varchar (20));\n");
//        preparedStatement.executeUpdate();
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into customers (melliID, name, car_name, car_year, car_price) values (?,?,?,?,?)");
        preparedStatement.setInt(1,entity.getMelliID());
        preparedStatement.setString(2, entity.getName());
        preparedStatement.setString(3, entity.getCar_name());
        preparedStatement.setInt(4, entity.getCar_year());
        preparedStatement.setString(5, entity.getCar_price());
        preparedStatement.executeUpdate();
    }
    public List<Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from customers");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setMelliID(resultSet.getInt("melliID"));
            entity.setName(resultSet.getString("name"));
            entity.setCar_name(resultSet.getString("car_name"));
            entity.setCar_year(resultSet.getInt("car_year"));
            entity.setCar_price(resultSet.getString("car_price"));
            entityList.add(entity);
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