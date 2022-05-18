public class LeapYear {
    public static boolean isLeapYear(int y){
        if(y>1 && y<9999){
            if(((y%4 == 0) && (y%100 !=0 )) || (y%400  ==0) ){
                return true;
            }else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}
