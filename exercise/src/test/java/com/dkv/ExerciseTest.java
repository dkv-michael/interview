package com.dkv;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.Set;

public class ExerciseTest {

    private Set<String> extractFromList(List<String> source, String ... toExtract) {
        // TODO: implement this
        return null;
    }

    @Test
    public void testExercise() {
        // given
        String toExtract = "a";
        List<String> src = List.of("a", "b", "c");

        // when
        Set<String> result = extractFromList(src, toExtract);

        // then
        assertThat(result.size(), equalTo(1));
        assertThat(result, hasItem(toExtract));
    }
}
