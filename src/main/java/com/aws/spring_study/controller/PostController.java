package com.aws.spring_study.controller;

import com.aws.spring_study.dto.JsonTestDto;
import com.aws.spring_study.dto.xWwwTestDto; /* import class alt enter */
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    // html form tag에서
    @PostMapping("/post/xwww")
    public Object xWwwUrlFormEncoded(xWwwTestDto xWwwTestDto) {

        System.out.println(xWwwTestDto);
        return null;
    }

    @PostMapping("/post/json") /* json형식의 data는 @RequestBody 어노테이션 필수 */
    public Object json(@RequestBody JsonTestDto jsonTestDto) {
        System.out.println(jsonTestDto);
        return null;
    }

}






