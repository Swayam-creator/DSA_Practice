import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows-->\n");
        int rows=sc.nextInt();
        System.out.println("Enter no.of cols-->\n");
        int cols=sc.nextInt();
        printPattern(rows,cols);
    }
    static void  printPattern(int rows,int cols){
        if(rows==0) return;
        if(cols<rows){
            System.out.print("*");
            printPattern(rows, cols+1);
        }
        else{
            System.err.println();
            printPattern(rows-1, 0);
        }

    }
}
