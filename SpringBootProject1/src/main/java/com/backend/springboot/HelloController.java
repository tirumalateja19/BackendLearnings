package com.backend.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HelloController {

    private ArrayList<String> list=new ArrayList<>();

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable String id){
        int n=Integer.parseInt(id);
        if(list.isEmpty() || n>list.size()){
            return "Just Hello !";
        }
        String greeting= list.get(n);
        return greeting;
    }

    @PostMapping("/greetings")
    public void greetings(@RequestParam String greeting){
        System.out.println("Greeting Submitted:"+greeting);
        list.add(greeting);
    }

}
