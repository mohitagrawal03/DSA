import java.util.*;

public class Q002_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter elements:");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the no. to search: ");
        int search_element = sc.nextInt();
        int found = 0;
        for(int i = 0; i < length; i++){
            if(search_element == arr[i]){
                System.out.println("Element is found at index: "+i);
                found = 1;
            }
        }
        if(found == 0){
            System.out.println("Element not found!");
        }
    }
}
