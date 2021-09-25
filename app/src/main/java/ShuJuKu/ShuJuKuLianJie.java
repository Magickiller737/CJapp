package ShuJuKu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 链接数据库、关闭数据库
 */
public class ShuJuKuLianJie {
    public Connection con=null;
    public PreparedStatement ps;
    public ResultSet re;


    public void openDB() throws ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");//加载驱动
        try {
            con= DriverManager.getConnection(
                    "*******",
                    "********",
                    "********");// 输入连接参数
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void closeResoure() throws SQLException {
        if(con!=null){
            con.close();
        }
        if(re!=null){
            re.close();
        }
        if(ps!=null){
            ps.close();
        }
    }
}
