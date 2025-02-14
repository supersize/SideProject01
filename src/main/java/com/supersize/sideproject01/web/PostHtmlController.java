package com.supersize.sideproject01.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-06
 */
@Controller
@RequestMapping("/post")
public class PostHtmlController {


    @GetMapping("/list")
    public String goToPostListPage () {
        return "post/postList";
    }
}
