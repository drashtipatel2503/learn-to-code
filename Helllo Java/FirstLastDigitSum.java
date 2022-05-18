public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        int a = number % 10;
        while (number>=10){
            number/=10;
        }
        number = (int)number;
        return number+a;

    }
}
