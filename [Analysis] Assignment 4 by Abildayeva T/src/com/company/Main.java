package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Integer> BruteForceIntersection(int[] A, int[] B) {
        List<Integer> C = new ArrayList<>();

        for (int a : A) {
            for (int b : B) {
                if (a == b) {
                    C.add(a);
                    break;
                }
            }
        }

        return C;
    }

    public static List<Integer> PresortingIntersection(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        List<Integer> C = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                C.add(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {1, 3, 5, 7, 9};

//        Brute-Force Algorithm
        List<Integer> bruteForceIntersection = BruteForceIntersection(A, B);
        System.out.println("Brute-Force Intersection: " + bruteForceIntersection);
        System.out.println("Time Complexity: O(n * m)");
        System.out.println("Space Complexity: O(k)");

//        Presorting-Based Algorithm
        List<Integer> presortingIntersection = PresortingIntersection(A, B);
        System.out.println("Intersection: " + presortingIntersection);
        System.out.println("Time Complexity: O(n log n + m log m)");
        System.out.println("Space Complexity: O(k)");
    }
}
