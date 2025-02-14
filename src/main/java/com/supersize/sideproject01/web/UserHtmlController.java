package com.supersize.sideproject01.web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.supersize.sideproject01.domain.User;
import com.supersize.sideproject01.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-13
 */
@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserHtmlController {

    @Autowired
    private final UserService userService;

    @GetMapping("/add")
    public String goToSignUpPage () {
        return "boilerplate/adduser";
    }

    @PostMapping ("/add")
    public String signUpUser (HttpServletRequest request, HttpServletResponse response, Model model,
          @ModelAttribute User user, RedirectAttributes redirectAttributes) {
        if (user == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "요청 받은 객체는 null 일수 없습니다.");
            return "redirect:/signup";
        }

        ;
        if (this.userService.addUser(user) == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "처리결과가 null입니다.");
            return "redirect:/signup";
        }

        // 로그인 페이지로이동
        return "boilerplate/login";
        }
    }
