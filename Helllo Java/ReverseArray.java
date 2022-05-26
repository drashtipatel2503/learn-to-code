public class ReverseArray {

    private static void reverse(int a[]){
//        int i=0;
        int j = a.length-1;
        int b = a.length/2;
        for (int i=0;i<b; i++){
            int k = a[i];
            a[i]= a[j-i];
            a[j-i]= k;

        }
    }
}
