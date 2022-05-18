public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if(a<10  || b<10){
            return -1;
        }
        int ans = 1;
        for (int i=1; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i ==0)
                ans=i;
        }
        return ans;

    }
}

