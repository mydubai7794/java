package bookSQL;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//添加用户到数据库实现注册
public class txSQL {

    public void addrow(String id,String book_name,String numb,String s) throws ClassNotFoundException, SQLException  {
        String URL="jdbc:mysql://127.0.0.1:3306/new_schema?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT";
        String USER="dubai";
        String PASSWORD="qq2572891795";
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库链接
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
//        String s="insert into book(id,book_name,numb) values(?,?,?);";
        PreparedStatement pst=conn.prepareStatement(s);

        pst.setString(1, id);
        pst.setString(2, book_name);
        pst.setString(3, numb);
        
        //关闭资源
        pst.execute();
        pst.close();
        conn.close();
    }
}