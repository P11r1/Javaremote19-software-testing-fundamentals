package org.example.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * AssertJ examples
 *
 * @author Marko
 */
public class AssertJExamples {

    @Test
    public void testString(){
        final String str = "Estonia is a silicon valley of Europe!";
        final String expected = "Estonia is a silicon valley of Europe!";

        Assertions.assertThat(str).isEqualTo(expected);
    }

    @Test
    public void testIntegerList() {
        List<Integer> numList = List.of(1, 5, 8, 23, 100);

        Assertions.assertThat(numList).hasSize(5)
                .contains(23);
    }

    @Test
    public void testString2() {
        final String testString = "Stranger things is an awesome Netflix drama!";

        Assertions.assertThat(testString).endsWith("drama!")
                .doesNotStartWith("Estonia")
                .isNotBlank()
                .isMixedCase()
                .contains(" ");
    }

    @Test
    public void testFloatList() {
        List<Float> floatList = List.of(2.3F, 5.7F, 6.2F, 90.85F, 100.8F, 52.4F);

        Assertions.assertThat(floatList).hasSize(6)
                .contains(6.2F)
                .containsOnlyOnce(52.4F)
                .doesNotHaveDuplicates()
                .containsExactlyInAnyOrder(2.3F, 5.7F, 6.2F, 90.85F, 100.8F, 52.4F)
                .startsWith(2.3F);
    }
}
