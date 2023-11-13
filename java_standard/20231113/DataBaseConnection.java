package course.part1;

import model2.Connection;
import model2.MSSQLDriver;
import model2.MySQLDriver;
import model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //oracle DB접속
        Connection conn = new OracleDriver();
        conn.getConnection("~2","system","manager");

        //mysql DB접속
       conn = new MySQLDriver();
        conn.getConnection("~1","root","123");

        //mssql DB접속
      conn = new MSSQLDriver();
        conn.getConnection("~3","sa","1234");
    }
}
