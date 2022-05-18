public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return 0-1;
        }else{
            int a = 0;
            while(number>0){
                int t = number % 10;
                if(t%2 == 0) {
//                    a *= 10;
                    a += t;
                }

                number /= 10;
            }
            return a;
        }

    }
}
