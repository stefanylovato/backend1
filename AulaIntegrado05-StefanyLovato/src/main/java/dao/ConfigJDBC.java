package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConfigJDBC {
    private String jdbcDriver;
    private String DB_URL;
    private String username;
    private String password;

    private static final String SQL_CREATE_TABLE_PATIENTS = "" +
            "DROP TABLE IF EXISTS PATIENTS;" +
            "CREATE TABLE PATIENTS" +
            "(id int AUTO_INCREMENT PRIMARY KEY," +
            "name VARCHAR(250)," +
            "last_name VARCHAR(250)," +
            "rg VARCHAR(20)," +
            "registered_date VARCHAR(20)," +
            "address_id int," +
            "FOREIGN KEY(address_id) REFERENCES ADDRESS(id int));";

    private static final String SQL_CREATE_TABLE_ADDRESS = "" +
            "DROP TABLE IF EXISTS ADDRESS;" +
            "CREATE TABLE ADDRESS" +
            "(id int AUTO_INCREMENT PRIMARY KEY," +
            "street VARCHAR(250)," +
            "number int," +
            "city VARCHAR(50)" +
            "state VARCHAR(50))";

    public ConfigJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.DB_URL = "jdbc:h2:~/test";
        this.username = "sa";
        this.password = "";
    }

    private void createTable(){
        try {
            Connection connection = connectionToDB();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE_ADDRESS);
            statement.execute(SQL_CREATE_TABLE_PATIENTS);
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private Connection connectionToDB(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(DB_URL, username, password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
