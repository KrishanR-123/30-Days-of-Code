import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

     static class TestDataEmptyArray {

        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {

        public static int[] get_array() {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        }
        
        public static int get_expected_result() {
            return 0;
        }
    }
     static class TestDataExactlyTwoDifferentMinimums {

        public static int[] get_array() {
            return new int[] { 1, 2, 3, 0, 4, 56, 0, 7, 8, 9 };
        }

        public static int get_expected_result() {
            return 3;
        }
    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }
