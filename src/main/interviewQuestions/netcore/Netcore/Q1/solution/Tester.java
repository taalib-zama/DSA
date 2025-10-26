package netcore.Netcore.Q1.solution;

import static netcore.Netcore.Q1.solution.Solution.solve;

public class Tester {
    public static void main(String[] args) {
        // Test Case 1: Given sample
        assert solve("AbcAb", "AbZ", 3, 4) == 4;

        // Test Case 2: Edge case - L > R
        assert solve("ABC", "AB", 4, 3) == -1;

        // Test Case 3: Not enough special chars for minimum L
        assert solve("XYZ", "ABC", 2, 3) == 0;

        // Test Case 4: Exact L matches
        assert solve("AAABBB", "AB", 3, 3) > 0;

        // Test Case 5: All characters special
        assert solve("AAAA", "A", 2, 4) == 6;

        // Test Case 6: No valid substrings
        assert solve("XYZ", "AB", 1, 2) == 0;

        // Test Case 7: Single char cases
        assert solve("A", "A", 1, 1) == 1;
        assert solve("A", "B", 1, 1) == 0;

        // Test Case 8: Large range
        assert solve("ABAB", "AB", 1, 4) == 10;

        // Test Case 9: Boundary - exactly K special chars
        assert solve("ABC", "ABC", 3, 3) == 1;

        // Test Case 10: Mixed pattern
        assert solve("AxBxC", "ABC", 2, 3) == 3;

        // Complex Test Case 1: Long string with repeating patterns
        assert solve("AbcAbcAbcAbcAbc", "Abc", 5, 8) > 0;

        // Complex Test Case 2: Large range with sparse special chars
        assert solve("AxBxCxDxExFxGxHx", "ABCD", 3, 10) > 0;

        // Complex Test Case 3: All same special character
        assert solve("AAAAAAAAAA", "A", 4, 7) == 22;

        // Complex Test Case 4: Interleaved special and non-special
        assert solve("AbXcAbXcAbXc", "Abc", 4, 6) > 0;

        // Complex Test Case 5: Multiple overlapping valid windows
        assert solve("ABABABABAB", "AB", 3, 5) == 24;

        // Complex Test Case 6: Edge case - exactly at boundaries
        assert solve("AbcdefAbcdef", "Abc", 6, 6) == 2;

        // Complex Test Case 7: Large string, small window
        assert solve("AbcdefghijklmnopqrstuvwxyzAbc", "Abc", 2, 3) > 0;

        // Complex Test Case 8: No consecutive special chars
        assert solve("AxBxCxAxBxC", "ABC", 3, 4) > 0;

        // Complex Test Case 9: Special chars at boundaries
        assert solve("AbcdefghijklmAbc", "Abc", 3, 6) > 0;

        // Complex Test Case 10: Maximum complexity
        assert solve("AbcAbcAbcAbcAbcAbcAbcAbc", "Abc", 10, 15) > 0;

        System.out.println("All complex test cases executed!");
        System.out.println("All test cases passed!");
    }
}
