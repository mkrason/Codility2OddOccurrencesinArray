package mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void checkArray1() {
        int[] a = {3};
        int result = solution.solution(a);
        assertTrue(3 == result);
    }

    @Test
    void checkArray2() {
        int[] a = {3, 2, 1, 4, 4, 2, 1, 3, 3};
        int result = solution.solution(a);
        assertTrue(3 == result);
    }

    @Test
    void checkArray3() {
        int[] a = {1, 2, 1, 4, 4, 2, 3, 3, 5};
        int result = solution.solution(a);
        assertTrue(5 == result);
    }

    @Test
    void checkArray4() {
        int[] a = {1, 2, 3, 4, 4, 2, 1};
        int result = solution.solution(a);
        assertTrue(3 == result);
    }

    @Test
    void checkArray5() {
        int[] a = {1, 2, 1, 1, 3, 4, 4, 2, 1};
        int result = solution.solution(a);
        assertTrue(3 == result);
    }

}