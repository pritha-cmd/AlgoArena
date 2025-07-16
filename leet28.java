public class leet28 {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            String window = haystack.substring(i, i + nLen);
            if (window.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
