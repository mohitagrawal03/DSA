public class Q001_ArrayReversal {
    public static void main(String[] args) {

    int[] a = {1, 2, 3, 4, 5};

    for(int i = 0; i < 5/2; i++){
        int temp = a[i];
        a[i] = a[5-1-i];
        a[5-1-i] = temp;
    }
    
    for(int i = 0; i < 5; i++){
        System.out.print(a[i]+" ");
    }
}
}
