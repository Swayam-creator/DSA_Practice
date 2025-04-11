
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import javax.naming.NameAlreadyBoundException;

public class SumofDigits{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number:->>");
    int n=Integer.parseInt(br.readLine());
    // int arr[]=new int[n];
    // StringTokenizer st=new StringTokenizer(br.readLine());
    // for(int i=0;i<n;i++){
    //     arr[i]=Integer.parseInt(st.nextToken());
    // }
    sumOfDigits(n,0);
  }
  private static  void sumOfDigits(int n,int sum){
    if(n<=0){
        System.out.println(sum);
        return;
    }
      int num=n%10;
      sum+=num;
      sumOfDigits(n/10,sum);
  }
}