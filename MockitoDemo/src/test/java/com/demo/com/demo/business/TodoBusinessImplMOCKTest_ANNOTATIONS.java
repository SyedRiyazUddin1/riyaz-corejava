package com.demo.com.demo.business;

import com.demo.business.TodoBusinessImpl;
import com.demo.data.api.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class) //when we go for mockito annotations

public class TodoBusinessImplMOCKTest_ANNOTATIONS {

    /**
     * What is Mocking? Mocking is creating objects that stimulate the behaviour of real objects
     * Unlike stubs, mocks can be dynamically created from code - at runtime.
     * Mocks offer more functionality than stubbing
     * We can verify methods calls and a lot of other things
     */

    //@Mock : mocks the specific class, replacement of the code:  TodoService todoServiceMock = mock(TodoService.class);
    @Mock
    TodoService todoServiceMock;

    //@InjectMocks: apart from mocking the class, it also checks if there are any dependencies (memember variables like TodoService in TodoBusinessImpl class)
    //it is working as this code: TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;

    @Captor
    ArgumentCaptor<String> stringArgumentCaptor; //HAVE TO IMPLEMENT THIS



    @Test
    public void usingMockito() {

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        //here When retrieveTodos method is called on todoServiceMock,then return the list of values
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(allTodos);


        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, todos.size());
    }

    @Test
    public void usingMockito_UsingBDD() {

        //Given (setting up)
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");
        given(todoServiceMock.retrieveTodos("Dummy")).willReturn(allTodos);

        //when
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");

        //then
        //assertEquals(2, todos.size());
        //can also write
        assertThat(todos.size(), is(2));
    }


    @Test
    public void letsTestDeleteNow() {

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(allTodos);

        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");

        verify(todoServiceMock).deleteTodo("Learn to Dance");

        verify(todoServiceMock, Mockito.never()).deleteTodo("Learn Spring MVC");

        verify(todoServiceMock, Mockito.never()).deleteTodo("Learn Spring");

        verify(todoServiceMock, Mockito.times(1)).deleteTodo("Learn to Dance");
        // atLeastOnce, atLeast

    }

}

/*
Problems with stubs are:
If there are two methods in the TodoService interface, then stub needs to override that method as well
code become complex when we need to add more logic based on different scenarios
 */