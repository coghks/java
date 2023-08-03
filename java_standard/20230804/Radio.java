package fc.java.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Radio 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("Radio 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("Radio 볼륨이 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("Radio 볼륨이 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("radio에서는 인터넷이 지원되지 않는다.");
    }
    //chUp(),chDown(),volUp(),volDown();

}
