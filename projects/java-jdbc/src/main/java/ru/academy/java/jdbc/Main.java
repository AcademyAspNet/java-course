package ru.academy.java.jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {

    private static String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private static String user = "SYSTEM_ADMINISTRATOR";
    private static String password = "admin123";

    static void main() throws SQLException {
        String name = IO.readln("Введите название: ");
        String englishName = IO.readln("Продублируйте название на английском: ");
        double price = Double.parseDouble(IO.readln("Укажите цену: "));

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "INSERT INTO MENU (NAME, NAME_ENG, PRICE) " +
                         "VALUES ('" + name + "', '" + englishName + "', " + price + ")";

            statement.executeUpdate(sql);
        }
    }

    static void selectExample() throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "SELECT * FROM MENU WHERE PRICE < 90";

            try (ResultSet resultSet = statement.executeQuery(sql)) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String name = resultSet.getString("NAME");
                    String nameEnglish = resultSet.getString("NAME_ENG");
                    double price = resultSet.getDouble("PRICE");

                    System.out.println(
                            "ID: " + id + ", NAME: " + name + " (ENG: " + nameEnglish + "), PRICE: " + price
                    );
                }
            }
        }
    }
}
