public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1)
            return  false;
        int s=0;
        for (int i =1;i<number;i++){
            if(number % i == 0)
                s+=i;
        }
        if(s==number)
            return true;
        return false;
    }
}
