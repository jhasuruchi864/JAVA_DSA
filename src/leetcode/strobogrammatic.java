package leetcode;
import java.util.*;

class Main {

    public static boolean isStrobogrammaticNumber(
            String s, Map<Character, Character> map) {

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {

            char l = s.charAt(i);
            char r = s.charAt(j);

            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Map<Character, Character> map = new HashMap<>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        String s = "69";

        System.out.println(isStrobogrammaticNumber(s, map));
    }
}