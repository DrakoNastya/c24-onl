package Lesson20;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
    //Задача 1:
    //1.1 Создать модель пользователя в Java(User).
    //1.2 Создать соответствующую модели таблицу в базе данных(users).
    //1.3 Вытянуть с помощью JDBC информацию о пользователе с id=1.
    //1.4 Распарсить данные из ResultSet в объект User.
    public static void main(String[] args) throws SQLException {
        Connection connection = (Connection) Main.getConnection();
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery("SELECT * FROM user WHERE ID = 1");
        User user;
        while (result.next()){
            int id = result.getInt("id");
            String name = result.getString("name");
            int age = result.getInt("age");
            user = new User(name, age, id);
            System.out.println(user);
        }
    }
}
