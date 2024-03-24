import java.util.HashMap;

public class Q001_ElementFrequencyCounter {
    public static void main(String[] args){
        HashMap<Integer,Integer> hm = new HashMap<>();

        int[] a = {1,1,1,2,2,3,2,1,3,3,2,5,5,6,3,2,4};
        int max = 0;

        for(int i = 0; i < a.length; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
                if(hm.get(a[i])>max){
                    max = a[i];
                }
            } else{
                hm.put(a[i], 1);
                if(hm.get(a[i])>max){
                    max = a[i];
                }
            }
        }

        System.out.println(hm);
        System.out.println(max);
        System.out.println(hm.get(max));
    }
}
