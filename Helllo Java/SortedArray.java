import java.util.Scanner;

public class SortedArray {
    public Scanner sc = new Scanner(System.in);
    public static int[] sortIntegers(int[] a){
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            int x=0;
            for (int j=0; j<a.length;j++){
                x=Math.max(a[j],x);
            }

        }

        return b;
    }
    public static int[] getIntegers(int n){
         Scanner sc = new Scanner(System.in);

        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();

        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println("Element " + i + " contents" + arr[i]);
        }
    }
}
