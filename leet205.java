public class leet205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        // Arrays to store character mappings
        int[] sTot = new int[256];
        int[] tTos = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If previously mapped, check consistency
            if (sTot[ch1] == 0 && tTos[ch2] == 0) {
                sTot[ch1] = ch2;
                tTos[ch2] = ch1;
            } else {
                if (sTot[ch1] != ch2 || tTos[ch2] != ch1)
                    return false;
            }
        }

        return true;
    }
}
