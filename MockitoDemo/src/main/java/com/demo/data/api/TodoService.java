package com.demo.data.api;

import java.util.List;

// External Service
public interface TodoService {
    public List<String> retrieveTodos(String user);
}

/**
 * Have to create TodoServiceStub
 * Test TodoBusinessImpl using TodoServiceStub
 */
