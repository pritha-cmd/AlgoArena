package leet;
public class leet1523 {
    public int countOdds(int low, int high) {
        // If either low or high is odd, add 1 to the count
        return ((high - low) / 2) + ((low % 2 != 0 || high % 2 != 0) ? 1 : 0);
    }
}



