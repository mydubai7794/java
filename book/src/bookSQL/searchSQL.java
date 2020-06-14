package bookSQL;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class searchSQL {

    public static StringBuffer returnGroup(int n,String condition) throws ClassNotFoundException, SQLException  {
        String URL="jdbc:mysql://127.0.0.1:3306/new_schema?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT";
        String USER="dubai";
        String PASSWORD="qq2572891795";
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库链接
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from book where "+condition+";");
        
String a []; 
a = new String[10];
StringBuffer c = new StringBuffer("id"+"          "+"book_name"+"       "+"numb"+"     "+"type"+"     "+"status"+"\n") ;
int i=0;
        
        //4.处理数据库的返回结果(使用ResultSet类)
        while(rs.next()){
        	if(i<n) { 
        	 a[i]=        rs.getString("id")+"        "
                          +rs.getString("book_name")+"         "
                          +rs.getString("numb")+"       "
                          +rs.getString("type")+"        "
                          +rs.getString("status")+"\n"
                          ;

             StringBuffer buffer = new StringBuffer();
             c = buffer.append(a[i]);
             i = i+1;
        	}
        }
		return c;

    }
}