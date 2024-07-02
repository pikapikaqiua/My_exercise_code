// 模板

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SlidingWindow {
    public static List<Integer> findAnagrams(String s, String p) {
        Map<String, Integer> need = new HashMap<String, Integer>();
        Map<String, Integer> window = new HashMap<String, Integer>();
        List<Integer> res = new ArrayList<>();

        return res;
    }

    public static void main(String[] args) {
        String s = "ababab";
        String p = "ab";
        findAnagrams(s, p);
    }
}
