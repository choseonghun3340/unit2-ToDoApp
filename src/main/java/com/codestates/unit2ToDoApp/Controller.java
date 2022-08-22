package com.codestates.unit2ToDoApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping()
    public String getString(){
        return  "To-do Application !";
    }
}
