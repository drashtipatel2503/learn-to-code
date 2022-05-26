public class Hello {
    public static  int toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return 0-1;
        }else{
            return ((int) (kilometersPerHour / 1.609344));
        }
    }

    public static void main(String[] args) {
        System.out.println("m");

//        System.out.println(
                NumberToWords.numberToWords(40);
//        int[] a = MinimumElement.readElements(2);
//        System.out.println(Arrays.toString(a));

//        System.out.println(a);

//        FactorPrinter.printFactors(10);
//        PerfectNumber.isPerfectNumber(28);
//            MinimumElement.readElements

    }

        public static void main2(String[] args) {


        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10));
//        System.out.println(0-1);
        System.out.println(toMilesPerHour(10));
        System.out.println("Hello, Drashti!!");
        int a  = 3;
        System.out.println(a);
//        8 primitive data types
//        32 bits
        int a1  = Integer.MIN_VALUE;
        System.out.println(a1);

        int a2 = Integer.MAX_VALUE;
        System.out.println(a2);
//8bits
       byte a11  = Byte.MIN_VALUE;

        System.out.println(a11);

        byte a22 = Byte.MAX_VALUE;
        System.out.println(a22);
//sixten bits
        short a101  = Short.MIN_VALUE;
        System.out.println(a101);

        short a202 = Short.MAX_VALUE;
        System.out.println(a202);


//
        long a111  = Long.MIN_VALUE;
        System.out.println(a111);

        long a222 = Long.MAX_VALUE;
        System.out.println(a222);


//        32 bits
        float a110  = Float.MIN_VALUE;
        System.out.println(a110);

        float a220 = Float.MAX_VALUE;
        System.out.println(a220);
//        sixty four bits
        double a011  = Double.MIN_VALUE;
        System.out.println(a011);

        double a022 = Double.MAX_VALUE;
        System.out.println(a022);


//        declare float and double with f and d at end
        float b = 2f;
        double c = 23.4d;
//        or cast it
        float b1 = (float)2;
        double c1 = (double)23.4;
        //adds decimal at the end.
        System.out.println(b+ " "+ b1 + " "+c+ " "+c1);

//        default for any decimal is double
        System.out.println(4.0/3.0 + " "+ (4f/3f));

//        char sixteen bits stores as UNICODE

        char a4 = 'F';
        char a44 = '\u0044';
        System.out.println(a4+ " "+ a44);

        boolean a123 = true;


        String s = "this is string";

//        String and int concates to string *****
//        String are immutable
//        assignment operator retirns value tthat is asigned so with its use in if
         boolean bol = false;
        if(bol  = true ){
            System.out.println("log 1") ;
        }
        System.out.println(bol);

//        if (a = 4){
//
//        } not work




    }
}
