import java.util.*;
public class Q003_BinarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the size of array: ");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // System.out.println("Enter the sorted array: ");
        // for(int i = 0; i < n; i++){
        //     a[i] = sc.nextInt();
        // }

        int[] a = {2, 4, 5, 23, 34, 45, 123};

        System.out.print("Enter element to search: ");
        int s = sc.nextInt();

        int low = 0;
        int high = a.length - 1;
        while(high>low){
            int mid = (low + high)/2;
            if(a[mid] == s){
                System.out.println("Element found!");
                return;
            }
            else if(a[mid] > s){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println("Elemnet not found!");
    }
}
