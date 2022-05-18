public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int t1  = (int) kiloBytes/1024;
            int r = kiloBytes - t1*1024;
            System.out.println(kiloBytes + " KB = "+ t1 + " MB and "+ r +  " KB" );
        }
    }

}