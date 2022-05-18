public class NumberPalindrome {
    public static boolean isPalindrome(int num){
// public static boolean main(String[] args){
        // System.out.println("THis");
        // int num =121;
        int g = num;
        if(num>0){
            int a = 0;
            while(num>0){
                int t = num % 10;
                a *=10;
                a += t;
                num /= 10;
            }
            if (a== g){
                return true;
            }else{
                return false;
            }
        }
        else{
            num = 0 - num;
            g = num;

            int a = 0;
            while(num>0){
                int t = num % 10;
                a *=10;
                a += t;
                num /= 10;
            }
            if (a== g){
                return true;
            }else{
                return false;
            }
        }
    }
}
