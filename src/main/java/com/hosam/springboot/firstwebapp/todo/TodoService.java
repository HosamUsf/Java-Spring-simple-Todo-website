package com.hosam.springboot.firstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }





    public List<Todo> findByUsername(String username) {
        return todoRepository.findByUsername(username);
    }

    public void addTodo(Todo todo) {
       todoRepository.save(todo);
    }

    public void deleteById(int id) {
        todoRepository.deleteById(id);
    }

    public void updateTodo(@Valid Todo todo) {

        todoRepository.save(todo);
    }


    public Optional<Todo> findById(int id) {
        return todoRepository.findById(id);
    }
}
