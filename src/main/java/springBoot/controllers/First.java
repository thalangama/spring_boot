package springBoot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class First {

    @GetMapping("/{id}/{name}")
    public String main(@PathVariable int id, @PathVariable String name){
        return "Main " + id +" - " + name;
    }

    @GetMapping("/{name}")
    public String main2(@PathVariable String name){
        return "Main " + name;
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("sam")
    public String test(){
        return "test";
    }
}
