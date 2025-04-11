import java.util.*;
public class geekOnac {
	public static void main (String[] args) {
		//code here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	   int n=sc.nextInt();
		int[] fib=new int[n+1];
		Arrays.fill(fib,-1);
		fib[1]=a;
		fib[2]=b;
		fib[3]=c;
	   int result=geekOnaci(n,fib);
	   System.out.println(result);
		}
		
	}
	private static  int geekOnaci(int n,int[] fib){
	    if(fib[n]!=-1){
	        return fib[n];
	    }
	    fib[n]=geekOnaci(n-1,fib)+geekOnaci(n-2,fib)+geekOnaci(n-3,fib);
	    return fib[n];
	}
}