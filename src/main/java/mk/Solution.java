package mk;

import java.util.Arrays;

public class Solution {

    public int solution(int[] a) {
        Arrays.sort(a);
        int length = a.length;
        int i = 0;
        int result = 0;

        while (i <= length) {
            if (length == 1) {
                result = a[i];
                i = length + 1;
            } else if (i == length - 1) {
                result = a[i];
                i = length + 1;
            } else if (a[i] == a[i + 1]) {
                i = i + 2;
            } else {
                result = a[i];
                i = length + 1;
            }

        }

        return result;
    }

}
