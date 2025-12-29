package test.q3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolveTest {
    @Test
    void sampleCase1() {
        int N = 8, M = 3;
        String S = "abcdeaab";
        String R = "abc";
        int Q = 3;
        int[] x = {1, 2, 3};
        int[] y = {8, 4, 8};

        int[] actual = Solve.solve(N, M, S, R, Q, x, y);
        int[] expected = {6, 0, 2};
        assertArrayEquals(expected, actual, "Sample test case failed");
    }

    @Test
    void allCharactersMatch() {
        int N = 5, M = 1;
        String S = "aaaaa";
        String R = "a";
        int Q = 1;
        int[] x = {1};
        int[] y = {5};

        int[] actual = Solve.solve(N, M, S, R, Q, x, y);
        // ways to pick 1 'a' from 5: each position is distinct subsequence, so answer is 5
        int[] expected = {5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void noMatchPossible() {
        int N = 4, M = 2;
        String S = "abcd";
        String R = "zz";
        int Q = 1;
        int[] x = {1};
        int[] y = {4};

        int[] actual = Solve.solve(N, M, S, R, Q, x, y);
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void edgeCaseEmptyPattern() {
        int N = 5, M = 0;
        String S = "abcde";
        String R = ""; // Empty pattern: always 1 way to form empty string
        int Q = 1;
        int[] x = {1};
        int[] y = {5};

        int[] actual = Solve.solve(N, M, S, R, Q, x, y);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }
}
