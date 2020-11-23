package Model.Repository;

import Model.Entity.Entity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Repository implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds", "ds123");
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement("create table loginfo(id number ,name varchar(30) , email varchar(30) , username varchar(30) ,password varchar(40))");
//        preparedStatement.executeUpdate(); //sakhte jadval
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into loginfo (id, name, email, username, password) values (?,?,?,?,?)");
        preparedStatement.setLong(1, entity.getId());
        preparedStatement.setString(2, entity.getName());
        preparedStatement.setString(3, entity.getEmail());
        preparedStatement.setString(4, entity.getUsername());
        preparedStatement.setString(5, entity.getPassword());
        preparedStatement.executeUpdate();
    }
    public void users(Entity entity) throws Exception{

        preparedStatement = connection.prepareStatement("insert into loginfo (id, name, email, username, password) values (?,?,?,?,?)");
        preparedStatement.setLong(1,1);
        preparedStatement.setString(2, "amirreza delavaran");
        preparedStatement.setString(3, "amiirds@gmail.com");
        preparedStatement.setString(4, " amir12");
        preparedStatement.setString(5, "amirreza");
        preparedStatement.executeUpdate();
        preparedStatement = connection.prepareStatement("insert into loginfo (id, name, email, username, password) values (?,?,?,?,?)");
        preparedStatement.setLong(1,2);
        preparedStatement.setString(2, "amiralids");
        preparedStatement.setString(3, "amir2GMAIL.COM");
        preparedStatement.setString(4, "ali123");
        preparedStatement.setString(5, "ali");
        preparedStatement.executeUpdate();
        preparedStatement = connection.prepareStatement("insert into loginfo (id, name, email, username, password) values (?,?,?,?,?)");
        preparedStatement.setLong(1,3);
        preparedStatement.setString(2, "rezads");
        preparedStatement.setString(3, "ami432GMAIL.COM");
        preparedStatement.setString(4, "reza43");
        preparedStatement.setString(5, "reza123");
        preparedStatement.executeUpdate();


    }
    public List<Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("SELECT * FROM loginfo");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entities = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setId(resultSet.getLong("id"));
            entity.setName(resultSet.getString("name"));
            entity.setEmail(resultSet.getString("email"));
            entity.setUsername(resultSet.getString("username"));
            entity.setPassword(resultSet.getString("password"));
            entities.add(entity);
        }
        return entities;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}