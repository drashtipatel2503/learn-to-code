public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if(a<10 || a>99 || b<10 || b> 99){
            return false;
        }
        int x =a%10;
        int y = b%10;
        a/=10;
        b/=10;
        if(a==b || a==y || x==b ||x==y){
            return true;
        }
        return false;
    }
}
