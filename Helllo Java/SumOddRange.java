public class SumOddRange {
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        if (number % 2 == 0) {

            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end){
        if (start<0 || end<0 || start>end){
            return 0-1;
        }
        int i;
        if(!isOdd(start)){
            start+= 1;
        }
        int s = 0;
        for(i=start; i<=end; i+= 2){
            s+= i;
        }
        return s;
    }
}
