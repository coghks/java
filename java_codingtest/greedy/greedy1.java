import java.util.*;
public class greedy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n,m,k를 공백기준으로 입력받기
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        //n개의 수를 공백기준으로 입력받기
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);//정렬하기 5 8 3     2 4 5 4 6  65442   66656665     2 2 2 4 2 2 2
        int sum=0; //출력해야하는 합
        int st=0; //스택(k)
        for (int i=0;i<m;i++){
            sum+=arr[n-1];
            st++;
            if(st==k){
                sum+=arr[n-2];
                i++;
                st=0;
            }

            }
        System.out.println(sum);
        System.out.println(arr[1]);
        }


    }

