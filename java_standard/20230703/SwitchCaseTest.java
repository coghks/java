public class SwitchCaseTest {
    public static void main(String[] args) {
        //요일에 해당하는 운동출력(Swtich case)
        String day="sunday";
        switch (day){
            case "sunday" :
                System.out.println("야구하기");
                break;
            case "monday" :
                System.out.println("농구하기");
                break;
            case "tuesday" :
            case "wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
