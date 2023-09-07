package com.aws.spring_study.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewsController {

    /* get요청에 response로 html파일을보내줌 : SSR */
    @ResponseBody // 데이터를 바로 응답. 없어야지만 view resolver가 작동
    @GetMapping("/student/register")
    public String studentRegister(Model model) {
        model.addAttribute("title", "학생등록");
        // html file에 model을 적용
        return "student_register"; /* html파일명을 return */
    }

}
















