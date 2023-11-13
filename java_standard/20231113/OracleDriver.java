package model2;
//OracleDriver는 회사에서 만들어서 제공하면됨
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 oracle DB를 접속 시도한다");
    }
}
