package book.ch8.jdbcTemplateTx;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hwbstart
 * @create 2022-05-02 3:01
 */
public class JdbcHelper {
    public static String jdbcdriver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/ssm_crud?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
    public static String user="root";
    public static String password="root";
    public static Connection connection=null;
    public static Connection getConnection(){
        if(null==connection){
            try {
                Class.forName(jdbcdriver).newInstance();
                connection=DriverManager.getConnection(url,user,password);
            } catch (Exception e) {
                System.out.println("连接失败");
            }
        }

        return connection;
    }
    public void closeall(Connection conn, Statement st, ResultSet rs){

        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void t1(){
        Statement st=null;
        ResultSet rs=null;
        getConnection();

        ArrayList<Account> list=new ArrayList<>();
        //创建sql
        String sql="SELECT * \n" + "FROM account LIMIT 10";
        try {
            st = connection.createStatement();

        rs = st.executeQuery(sql);
            //接收结果集
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
               double balance = rs.getDouble("balance");
                list.add(new Account(id,username,balance));
        }}catch (SQLException e) {
            e.printStackTrace();
        }finally {
            for (Account account : list) {
                System.out.println(account);
            }

        }


        closeall(connection,st,rs);
    }

}
