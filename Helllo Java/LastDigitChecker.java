public class LastDigitChecker {
    public static boolean isValid(int a) {
        if (a<10 || a>1000){
            return false;
        }return true;
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(a<10 || a>1000 || b<10 || b> 1000 || c<10 || c>1000){
            return false;
        }
        int x = a%10;
        int y = b%10;
        int z=c%10;
        if (x==z || z==y || x==y){
            return true;
        }
        return false;

    }
}
