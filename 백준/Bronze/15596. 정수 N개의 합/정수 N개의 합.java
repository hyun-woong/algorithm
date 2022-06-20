public class Test {
    long sum(int[] a) {
        long ans = 0;
        
        for(long t : a) {
            ans += t;
        }
        return ans;
    }
}
