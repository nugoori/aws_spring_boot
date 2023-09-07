package com.aws.spring_study.controller;

import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.repository.UserMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UserMappers userMappers;

    @CrossOrigin // cros origin 관련 오류 해결 / 각각의 요청에 다 달아 줘야 함
    @PostMapping("/user")
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserReqDto registerUserReqDto) {

        Integer count = userMappers.saveUser(registerUserReqDto); // mapper.xml로 바로 넘어감?

        return ResponseEntity.ok().body(count);
    }

}





