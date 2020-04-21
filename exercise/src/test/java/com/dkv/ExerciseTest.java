package com.dkv;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.Set;

public class ExerciseTest {

    private Set<String> extractFromList(List<String> source, String ... toExtract) {
        // TODO: implement this
        return null;
    }

    @Test
    public void shouldExtractValuesFromList() {
        // given
        String toExtract1 = "a";
        String toExtract2 = "d";
        List<String> src = List.of("a", "b", "c", "d");

        // when
        Set<String> result = extractFromList(src, toExtract1, toExtract2);

        // then
        assertThat(result.size(), equalTo(2));
        assertThat(result, hasItems(toExtract1, toExtract2));
    }
}
