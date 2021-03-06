package com.demo.data.api;

import java.util.List;

// External Service
public interface TodoService {
    public List<String> retrieveTodos(String user);

    void deleteTodo(String todo);
}

/**
 * Have to create TodoServiceStub
 * Test TodoBusinessImpl using TodoServiceStub
 */
