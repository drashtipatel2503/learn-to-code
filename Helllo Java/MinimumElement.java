import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement{
    private static int readInteger(){
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
//        sc.nextLine();
//        System.out.println("you entered"+a);
        return a;
    }
    private static int[] readElements(int n){
        int[] a =new int[n];
        for(int i=0;i<n; i++) {
            a[i] = readInteger();
        }
        System.out.println(Arrays.toString(a));

        return (a);
    }
    private static int findMin(int[] a){
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            ans =Math.min(a[i],ans);
        }
        return ans;
    }
}
