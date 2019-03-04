package io.codelex.testingtasks.tasks;

import java.util.HashSet;

public class OddOccurrencesInArray {
   
    public static void main(String[] args) {
        System.out.println(solution3(new int[] { 9, 3, 9, 3, 9, 7, 9 }));

    }

    public static int solution(int[] A) {
        int element = 0;

        for (int i = 0; i < A.length; i++) {
            element ^= A[i];
        }
        return element;
    }

    public static int solution2(int[] A) {
        HashSet<Integer> in = new HashSet<Integer>();
        int element = -1;

        for (int i = 0; i < A.length; i++) {
            if (in.add(A[i])) {
                element = A[i];
            }
        }
        return element;
    }
    
    public static int solution3(int[] A) {
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j] && i != j) {
                    A[i] = -1;
                    A[j] = -1;
                    j = A.length;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != -1)
                return A[i];
        }

        return 0; 
    }
}