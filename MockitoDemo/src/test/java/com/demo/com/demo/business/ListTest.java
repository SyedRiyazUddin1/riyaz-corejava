package com.demo.com.demo.business;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListSize_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        //first time, it will return 2, then 3 as per above method, we can test multiple values below
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void letsMockListGet() {
        List listMock = mock(List.class);

        /**
         * Now everytime listMock.get() method is called,
         * i wanted to return the string "Its working" irrespective of the parameter,
         * for that we have ArgumentMatcher **anyInt() method**
         *  //when(listMock.get(0)).thenReturn("Its working");
         * there are other methods as well like anyObject(), anyList(), anyBoolean() etc...
         */

        when(listMock.get(anyInt())).thenReturn("Its working");

        assertEquals("Its working", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    //throwing an exception
    @Test(expected = RuntimeException.class) //using Junit feature here,
    // without this expected tag, the test will fail
    public void letsMock_throwAnException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something!"));
        listMock.get(0);
    }

    @Test
    public void letsMockListGet_UsingBDD() {
        //Given (mock where everything is returning "DummyReturn")
        List<String> listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("DummyReturn");

        //When  (getting the first element)
        String firstElement = listMock.get(0);

        //Then
        assertThat(firstElement, is("DummyReturn"));

    }


}
