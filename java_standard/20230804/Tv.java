package fc.java.poly;

public class Tv implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("TV 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("TV 볼륨이 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("TV 볼륨이 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("tv에선 인터넷이 실행된다")  ;
    }
}
