package com.demo.com.demo.business;

import com.demo.business.TodoBusinessImpl;
import com.demo.data.api.TodoService;
import com.demo.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> filteredTodos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}

/*
Problems with stubs are:
If there are two methods in the TodoService interface, then stub needs to override that method as well
code become complex when we need to add more logic based on different scenarios
 */