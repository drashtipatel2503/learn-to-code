public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount <0 || goal<0)
            return false;
        else {
            int a = goal/5;
            int b = goal%5;
            if(a >= bigCount && b >= smallCount )
                return true;
            else if( bigCount - a  == (b-smallCount)/5  )
                return true;
            return false;
        }
//        else if(smallCount>goal){
//            return true;
//        }
//        else if( bigCount*5 + smallCount >= goal ){
//            if(bigCount*5 + smallCount - goal <= smallCount)
//                return true;
//            else if(goal%5 <= bigCount && goal%5 == 0 )
//
//                return true;
//            return false;
//
//        }
//
//        return false;
    }

}
