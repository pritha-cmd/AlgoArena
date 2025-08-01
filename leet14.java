public class leet14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // Example usage
    // public static void main(String[] args) {
    //     leet14 lcp = new leet14();
    //     String[] strs = {"flower", "flow", "flight"};
    //     System.out.println(lcp.longestCommonPrefix(strs));  // Output: "fl"
    // }
}