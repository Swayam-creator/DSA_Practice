import java.util.*;
public class FirstCapital {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int index=0;
        int n=s.length();
        index=getFirstCap(s,index,n);
        System.out.println(s.charAt(index) +" at index " + index);
        sc.close();
    }
    private static  int getFirstCap(String s,int index,int n){
       if(index==n-1){

        if(s.charAt(index)<97) return index;
        return 0;
       }

       if(s.charAt(index)<97){
        return index;
      }
      
     return getFirstCap(s, index+1, n);

    }
}
