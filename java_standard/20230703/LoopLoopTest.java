public class LoopLoopTest {
    public static void main(String[] args) {
        for (int i=2;i<=9;i++){
            System.out.print(i+"단"+"\t\t");

        }
        System.out.println();
        int i=1;
        do {
            for(int j=2;j<=9;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            i++;
            System.out.println();
        }while(i<=9);
    }
}
