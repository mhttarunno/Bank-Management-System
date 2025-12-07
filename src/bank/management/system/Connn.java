package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankManage",
                    "root",
                    "Creategmail@47"
            );

            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

