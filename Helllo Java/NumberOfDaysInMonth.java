public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int a , int b){
        if(a<1 || a>12 || b<1 || b>9999){
            return 0-1;
        }
        else{
            switch(a){
                case 1:
                    return 31;
//                    break;
                case 2:
                    if (isLeapYear(b)) {
                        return 29;
                    }
                    else {
                        return 28;
                    }
                    //break;
                case 3:
                    return 31;
                    //break;
                case 4:
                    return 30;
                    //break;

                case 5:
                    return 31;
                    //break;
                case 6:
                    return 30;
                    //break;
                case 7:
                    return 31;
                    //break;
                case 8:
                    return 31;
                    //break;
                case 9:
                    return 30;
                    //break;
                case 10:
                    return 31;
                    //break;

                case 11:
                    return 30;
                    //break;
                case 12:
                    return 31;
                    //break;
                default:
                    return 0-1;
                    //break;


            }
        }
    }
}
