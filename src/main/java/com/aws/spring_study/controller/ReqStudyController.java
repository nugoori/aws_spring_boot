package com.aws.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

// spring을 설치하면 자동으로 jackson 라이브러리를 설치
/* controller : view(html), data response도 가능 = SSR 가능 vs RestController ( controller + responseBody) : data만 response가능 = CSR */
@RestController
public class ReqStudyController {

    // json 사용x
    @GetMapping("/test/get")
    public Object get() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("name", "김준일");
        dataMap.put("email", "aaa@aaa.com");
        return dataMap;
    }

    @PostMapping("/test/post")
    public Object post() {
        return "POST";
    }

    @PutMapping("/test/put")
    public Object put() {
        return "PUT";
    }

    // pathVariable만 사용 -> data전송이 필요없음
    @DeleteMapping("/test/delete")
    public Object delete() {
        return "DELETE";
    }


}

















