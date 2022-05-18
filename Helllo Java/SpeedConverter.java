public class SpeedConverter {
    // write your code here

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return 0-1;
        }else{
            return (Math.round(kilometersPerHour/1.609));
        }
    }
    public static void printConversion(double kilometersPerHour){
        long t =  toMilesPerHour(kilometersPerHour);
        if(t == -1 )

            System.out.println("Invalid Value");
        else{
            System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }
}