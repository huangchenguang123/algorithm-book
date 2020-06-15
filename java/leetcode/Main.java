package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

//    public static void main(String[] args) {
//        String s = "abcdad";
//        System.out.println(fun(s));
//    }

    public static void main(String[] args) {
        int[] b = {2, 4, 6, 8};
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                set.remove(b[i]);
            }
        }
        System.out.println(set);
    }

}
