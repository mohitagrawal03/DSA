import java.util.HashSet;

public class Q001_CommonElementsFinder {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        int[] a = {4,2,5,3,6,1};
        int[] b = {2,1,4,3,4};

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < a.length; j++){
                if(b[i] == a[j]){
                    hs.add(b[i]);
                }
            }
        }

        System.out.println(hs);
    }
}
