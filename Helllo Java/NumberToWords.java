public class NumberToWords {

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        else if(number == 0 ){
            System.out.println("Zero");
        }
        else{
            int c = getDigitCount(number)- getDigitCount(reverse(number));
            number = reverse(number);
//            System.out.println(number);
            while(number>0){
                switch(number % 10){
                    case 1:
                        System.out.println("One");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                }
                number/=10;
            }
            for(int i=0;i<c ; i++){
                System.out.println("Zero");
            }

        }
    }

    public static int getDigitCount(int a){
        if(a==0)
            return 1;
        if(a<0)
            return 0 - 1;
        int c =0;
        while(a>0){
            c+=1;
            a/=10;
        }
        return c;
    }

    public static int reverse(int a){
        int f = 1;
        if(a<0){
            f=-1;
            a= 0 - a;
        }
        int nf = 0;
//        System.out.println(nf);
//        int a = 0;
        while(a>0) {
            int t = a % 10;
            nf *= 10;
            nf += t;
            a /= 10;
        }
//
//            System.out.println(nf);
//
//        System.out.println(f);
        return f * nf;
    }
}
