package textSQL;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import GraIterface.userGraIterface;

public class veriSignUp {
    public void verifications(String userName,String password) throws ClassNotFoundException, SQLException  {
        String URL="jdbc:mysql://127.0.0.1:3306/new_schema?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT";
        String USER="dubai";
        String PASSWORD="qq2572891795";
        //1.������������
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.������ݿ�����
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ飨ʹ��Statement�ࣩ
        String s="select user_name,user_password from user where user_name=? and user_password=?";
        PreparedStatement pst=conn.prepareStatement(s);

        pst.setString(1, userName);
        pst.setString(2, password);
        ResultSet rs=pst.executeQuery();
        //4.�������ݿ�ķ��ؽ��(ʹ��ResultSet��)
        if(rs.next()){
        	JOptionPane.showMessageDialog(null, "ע��ɹ������¼");
        }
        else {
        	JOptionPane.showMessageDialog(null, "ע��ʧ��");
        }
        //�ر���Դ
        rs.close();
        pst.close();
        conn.close();
    }
}
