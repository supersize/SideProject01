package kr.go.forest.map.dpbs.boot.document.sideproject01.web;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.function.Function;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-06
 */
@RequestMapping("/")
public class MainController {


     public String main () {
         return "index";
     }

     public void test () {

         Function<String, String> f = s -> s.equals("Y") ? "true" : "false";

         System.out.println("f : " + f);
     }
}
