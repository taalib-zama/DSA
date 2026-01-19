package netcore.Netcore.Q2.q2;


import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MaximumRemainderTest {


    @Test
    void testBasicCase() {
        long [] A = {1, 2, 3, 4, 5, 6};
        long k = 4;
        assertEquals(3, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }

    @Test
    void testAllOddNumbers() {
        long[] A = {1, 3, 5, 7, 9, 11};
        long k = 5;
        assertEquals(0, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }

    @Test
    void testAllEvenNumbers() {
        long[] A = {2, 4, 6, 8, 10, 12};
        long k  = 6;
        assertEquals(0, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }

    @Test
    void testLargeNumbers() {
        long[] A = {1000001, 1000002, 1000003, 1000004, 1000005, 1000006};
        long k = 1000;
        assertEquals(6, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }

    @Test
    void testNegativeNumbers() {
        long[] A = {-1, -2, -3, -4, -5, -6};
        long k = 5;
        assertEquals(4, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }

    @Test
    void testMixedNumbers() {
        long[] A = {-10, -5, 0, 5, 10, 15};
        long k = 7;
        assertEquals(6, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }

    @Test
    void testSingleOddAndEven() {
        long[] A = {1, 2};
        long k = 3;
        assertEquals(0, MaximumRemainder.find_maximum_remainderUsingStream(2, A, k));
    }

    @Test
    void testLargeArray() {
        long[] A = new long[100000];
        for (int i = 0; i < 100000; i++) {
            A[i] = i + 1;
        }
        int k = 100;
        assertEquals(99, MaximumRemainder.find_maximum_remainderUsingStream(100000, A, k));
    }

    @Test
    void testKGreaterThanSum() {
        long[] A = {1, 2, 3, 4};
        long k = 20;
        assertEquals(10, MaximumRemainder.find_maximum_remainderUsingStream(4, A, k));
    }

    @Test
    void testKEqualTo1() {
        long[] A = {1, 2, 3, 4, 5, 6};
        long k = 1;
        assertEquals(0, MaximumRemainder.find_maximum_remainderUsingStream(6, A, k));
    }
}
