package io.codelex.testingtasks.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


public class StrSymmetryPointTest {
    // check if string racecar returns 3 and x returns 0
    @Test
    public void should_return_3() {
        //given
        String s = "racecar";
        //when
        StrSymmetryPoint racecar = new StrSymmetryPoint();

        //then
        assertTrue((racecar.solution(s) == (3)));

    }

    @Test
    public void should_return_0() {
        //given
        String s = "x";
        //when
        StrSymmetryPoint x = new StrSymmetryPoint();

        //then
        assertTrue((x.solution(s) == (0)));
    }
}