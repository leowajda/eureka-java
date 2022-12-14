package string.iterative;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

class LC_0003 {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c))
                left = max(map.get(c) + 1, left);

            result = max(right - left + 1, result);
            map.put(c, right);
        }

        return result;
    }
}
