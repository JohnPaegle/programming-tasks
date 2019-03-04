package io.codelex.testingtasks.tasks;

import java.util.HashSet;

public class OddOccurrencesInArray {
   
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));

    }

    public static int solution(int[] A) {
        int element = 0;

        for (int i = 0; i < A.length; i++) {
            element ^= A[i];
        }
        return element;
    }

    public static int solution2(int[] A) {
        HashSet<Integer> input = new HashSet<Integer>();
        int element = -1;

        for (int i = 0; i < A.length; i++) {
            if (input.add(A[i])) {
                element = A[i];
            }
        }
        return element;
    }
    
}