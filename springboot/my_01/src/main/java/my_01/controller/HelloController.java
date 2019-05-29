package my_01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {


    @Value("${person.name}")
    private String name;
    @ResponseBody
    @RequestMapping("/zwj")
    public String hello(){

        return "hello " + name;
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){

        map.put("hello","你好");
        map.put("users", Arrays.asList("小啾子","啾子啾子"));
        return  "success";
    }

}
