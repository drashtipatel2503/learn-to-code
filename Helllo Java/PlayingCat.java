public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer){
            if(temperature > 24 && temperature<46 ){
                return true;
            }
            return false;
        }
        else{
            if(temperature > 24 && temperature<36 ){
                return true;
            }
            return false;

        }

    }
}
