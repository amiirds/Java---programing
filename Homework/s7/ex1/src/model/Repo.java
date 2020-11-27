package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repo implements AutoCloseable {
    Scanner input = new Scanner(System.in);
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds", "ds123");
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement("create table data(id number ,data number , bill number , username varchar(30) ,password varchar(40))");
//        preparedStatement.executeUpdate();
    }

    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into data (id, data, bill, username, password) values (?,?,?,?,?)");
        preparedStatement.setInt(1,1);
        preparedStatement.setInt(2,2);
        preparedStatement.setLong(3,1000);
        preparedStatement.setString(4,"amiirds");
        preparedStatement.setString(5,"amir123");
//        preparedStatement.executeUpdate();
    }
    public void update(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("update data set data = ?, bill = ?, username = ?, password = ? where id = ?");
        preparedStatement.setInt(1,entity.getData());
        preparedStatement.setLong(2,entity.getBill());
        preparedStatement.setString(3,entity.getUsername());
        preparedStatement.setString(4,entity.getPassword());
    }
    public List<Entity> view() throws Exception {
        preparedStatement = connection.prepareStatement("select * from data");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entities = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setData(resultSet.getInt("data"));
            entity.setBill(resultSet.getLong("bill"));
            entity.setUsername(resultSet.getString("username"));
            entity.setPassword(resultSet.getString("password"));
            entities.add(entity);
        }
        return entities;
    }

    public void commit() throws Exception{
        connection.commit ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}