package com.aws.spring_study.controller;

import com.aws.spring_study.dto.JsonTestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RespStudyController {

    @GetMapping("/resp/str")
    public String strTest() {
        return "문자열";
    }

    @GetMapping("/resp/obj")
    public Object objectTest() {
        Map<String, Object> responseMap = new HashMap<>();
        return responseMap; // Object에 Map으로 데이터를 보내면 자동으로 JSON으로 응답 (Content-Type!!)
    }

    @GetMapping("/resp/obj2")
    public Object objectTest2() {
        JsonTestDto jsonTestDto = new JsonTestDto();
        jsonTestDto.setName("김준일");
        jsonTestDto.setAge(30);
        return jsonTestDto;
    }

    // responset status 바꾸기?
    @GetMapping("/resp/status")
    public Object statusTest(HttpServletResponse response, HttpServletRequest request) {
        response.setStatus(400);
        return null;
    }
    // spring에선 위의servlet에서 처럼 사용하지 않고 이미 만들어져 있는 ResponseEntity를 사용

    @GetMapping("/resp/resp-entity")
    public ResponseEntity<JsonTestDto> reponseEntityTest() {
        JsonTestDto jsonTestDto = new JsonTestDto();
        jsonTestDto.setName("김준일");
        jsonTestDto.setAge(30);
        // ResponseEntity는 응답 되어지는 Data의 타입을 지정 해줘야 함
        return new ResponseEntity<JsonTestDto>(jsonTestDto, HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/resp/map-resp")
    public ResponseEntity<Map<String, Object>> mapResponseEntity() {
        Map<String, Object> map = new HashMap<>();
        map.put("data", "데이터입니다.");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    // request는 매개변수로 들어옴
    @GetMapping("/resp")
    public ResponseEntity<JsonTestDto> jsonResponse() {
        JsonTestDto jsonTestDto = new JsonTestDto();
        jsonTestDto.setName("김준일");
        jsonTestDto.setAge(30);
        // status() 부분에 모든 응답이 다 있는것은 아님
//        return ResponseEntity.ok().body(jsonTestDto);
//        return ResponseEntity.badRequest().body(jsonTestDto);
//        return ResponseEntity.status(405).body(jsonTestDto);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonTestDto);
    }




}


















