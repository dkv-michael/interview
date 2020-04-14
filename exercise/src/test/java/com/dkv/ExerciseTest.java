package com.dkv;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExerciseTest {

    @Test
    public void testExercise() {
        int i = 1;
        assertThat(i, equalTo(1));
        System.out.println("done");
    }
}
