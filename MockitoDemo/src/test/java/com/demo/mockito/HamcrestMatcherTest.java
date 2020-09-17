package com.demo.mockito;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;
import static org.hamcrest.core.Every.everyItem;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestMatcherTest {

    @Test
    public void basicHamcrestMatchers() {
        //Creating a list
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);

        //scores has 4 items
        assertThat(scores, hasSize(4));

        //testing the items contains in the list
        assertThat(scores, hasItems(100, 101));

        //testing if every item is greater than the given value
        assertThat(scores, everyItem(greaterThan(90)));

        //testing if every item is greater than the given value
        assertThat(scores, everyItem(lessThan(200)));

        // String related asserts
        //checking if it is Empty String
        assertThat("", isEmptyString());

        //checking if it is Empty or Null String
        assertThat(null, isEmptyOrNullString());

        // Array
        Integer[] marks = {1, 2, 3};

        //test the size with the given value
        assertThat(marks, arrayWithSize(3));

        //check if an array contains the elements in given order
        assertThat(marks, arrayContaining(1, 2, 3));

        //check if an array contains the elements in any order
        assertThat(marks, arrayContainingInAnyOrder(2, 3, 1));

    }
}
