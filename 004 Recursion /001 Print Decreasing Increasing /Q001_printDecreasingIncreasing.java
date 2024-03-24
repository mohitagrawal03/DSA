import java.util.Scanner;

public class Q001_printDecreasingIncreasing {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("printDecreasing output: ");
        printDecreasing(n);
        System.out.println();
        System.out.print("printIncreasing output: ");
        printIncreasing(n);
        System.out.println();
        System.out.print("printDecrIncr output: ");
        printDecrIncr(n);
    }

  public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1); 
    }

  public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

  public static void printDecrIncr(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDecrIncr(n-1);
        System.out.print(n+" ");
    }
}
