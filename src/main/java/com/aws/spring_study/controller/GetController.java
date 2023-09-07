package com.aws.spring_study.controller;

import com.aws.spring_study.dto.ParamsTestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {


    @GetMapping("/get/params/1")
    // 변수명 = parameter명이 같으면 ()안에 annotation을 명시하지 않아도 됨 / annotation을 명시하면 NotNull값이됨
    public Object paramsTest1(@RequestParam String name, @RequestParam Integer age) {
        System.out.println(name);
        System.out.println(age);
        return null;
    }

    @GetMapping("/get/params/2")
    public Object paramsTest2(ParamsTestDto paramsTestDto) {
        System.out.println(paramsTestDto);
        return null;
    }

    // getMapping - pathVariable의 key값을 맞추면 전달 받을 변수에 들어옴
    // URI에 가변형 변수를 넣기 위해 사용 > 클라에서 요청하는 특정한 데이터를 전달 가능
    @GetMapping("/get/{id}")
    public Object pathVariable(@PathVariable("id") int id) {
        System.out.println(id);
        return null;
    }


}
