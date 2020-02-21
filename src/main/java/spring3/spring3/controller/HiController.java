package spring3.spring3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HiController {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name){
        return "Hi! " + name;
    }

    @GetMapping("/bye")
    public String bye(@RequestParam String name, int age){
        return "Bye! " + name + " who is " + age + " years old";
    }

    @GetMapping("/batman")
    public String batman(){
        return "I'm Batman!";
    }

    @PostMapping("/post")
    public String posting(){
        return "I'm creating shit!";
    }

    @PutMapping("/put")
    public String putting(){
        return "Im updating shit!";
    }

    @DeleteMapping("/delete")
    public String deleting(){
        return "Deleting shit!!!";
    }


}
