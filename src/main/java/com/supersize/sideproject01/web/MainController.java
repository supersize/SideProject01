package com.supersize.sideproject01.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.function.Function;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-06
 */
@Controller
@RequestMapping("/")
public class MainController {


//     public void main () {
//         return "index";
//     }

     @GetMapping("test")
     public String test () {

         Function<String, String> f = s -> s.equals("Y") ? "true" : "false";

         System.out.println("f : " + f.apply("Y"));

         return "test";
     }

    @GetMapping("login")
    public String goToLoginPage() {

        return "boilerplate/login";
    }



}
