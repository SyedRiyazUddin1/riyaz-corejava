package com.demo.com.demo.business;

import com.demo.business.TodoBusinessImpl;
import com.demo.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMOCKTest {

    /**
     * What is Mocking? Mocking is creating objects that stimulate the behaviour of real objects
     * Unlike stubs, mocks can be dynamically created from code - at runtime.
     * Mocks offer more functionality than stubbing
     * We can verify methods calls and a lot of other things
     */

    @Test
    public void usingMockito() {

        //creating a mock object of TodoService (class or an interface)
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        //here When retrieveTodos method is called on todoServiceMock,then return the list of values
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(allTodos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, todos.size());
    }
}

/*
Problems with stubs are:
If there are two methods in the TodoService interface, then stub needs to override that method as well
code become complex when we need to add more logic based on different scenarios
 */