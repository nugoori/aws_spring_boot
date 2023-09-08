package com.aws.spring_study.controller;

import com.aws.spring_study.dto.ModifyUserReqDto;
import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import com.aws.spring_study.repository.UserMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserMappers userMappers;

    @CrossOrigin // cros origin 관련 오류 해결 / 각각의 요청에 다 달아 줘야 함
    @PostMapping("/user")
    public ResponseEntity<Integer> registerUser(@RequestBody RegisterUserReqDto registerUserReqDto) {
                                        // @RequestBody가 전달받은 데이터를 RegisterUserReqDto객체로 변환
        Integer count = userMappers.saveUser(registerUserReqDto); // mapper.xml로 바로 넘어감?

        return ResponseEntity.ok().body(count);
    }

    @CrossOrigin
    @GetMapping("/user/list")
    public ResponseEntity<List<User>> userListAll() {
        return ResponseEntity.ok().body(userMappers.getUserListAll());
    }

    @CrossOrigin
    @PutMapping("/users/{userId}")
    public ResponseEntity<Integer> modifyUser(
            @PathVariable int userId,
            @RequestBody ModifyUserReqDto modifyUserReqDto) {
        return ResponseEntity.ok().body(userMappers.modifyUser(modifyUserReqDto));
    }

    @CrossOrigin
    @DeleteMapping("/users/delete/{userId}")
    public ResponseEntity<Integer> deleteUser(@PathVariable int userId) {
        System.out.println(userId);
        return ResponseEntity.ok().body(userMappers.deleteUser(userId));
    }

}





