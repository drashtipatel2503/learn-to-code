public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPoints(double a , double b){
        int l1=(int)a;
        int b1 =(int)b;
        a *= 1000;
        b *= 1000;
        a = (int)a;
        b = (int)b;
        int o1 = (int) (a % 10);
        int o2 = (int) (a%100);
        int o3 = (int) (a%1000);
        int o4 = (int) (b%10);
        int o7 = (int) (b%100);
        int o8 = (int) (b%1000);
        if(l1==b1 && o1 == o4 && o2 == o7 && o3 == o8){
            return true;
        }else{
            return false;
        }



    }
}
