package io.codelex.testingtasks.tasks;

public class StrSymmetryPoint {
    
    public int solution(String s) {
        if ((s.length() & 1) == 0) {
            return -1;
        }
        final int result = s.length() / 2;
        for (int i = result, j = result; j >= 0; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return -1;
            }
        }
        return result;

    }
}

