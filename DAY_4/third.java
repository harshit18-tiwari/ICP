import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class third {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        
        int[] freqP = new int[26];
        int[] freqS = new int[26];
        
        for (char c : p.toCharArray()) freqP[c - 'a']++;
        
        for (int i = 0; i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            
            if (i >= p.length()) {
                freqS[s.charAt(i - p.length()) - 'a']--;
            }
            
            if (Arrays.equals(freqP, freqS)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}
