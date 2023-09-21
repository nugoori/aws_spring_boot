package com.aws.spring_study.controller;

import com.aws.spring_study.service.IoCTestService1;
import com.aws.spring_study.service.IoCTestService2;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
*  Component의 종류
* 1. 요청과 응답 -> @Controller(SSR까지 가능) -> RESTFULL 한 Controller -> @RestController
* 2. 비즈니스 로직(Controller와 Repository(DB)사이에서 처리되는 로직) -> @Service
* 3. 데이터베이스 -> @Repository -> DAO -> Mybatis: @Mapper / JPA: @Repository
* 4. 설정(보안...) , 2개 이상의 Bean 등록 시-> @Configuration
* 5. 그 외의 모든 IoC 객체는 @Component를 사용!!!
* ************************************************************************************/

@RestController
@RequiredArgsConstructor
public class IoCTestController {
//    @Autowired
    private final IoCTestService1 ioCTestService1;
//    @Autowired
    private final IoCTestService2 ioCTestService2;

//    public IoCTestController() {
//        ioCTestService1 = new IoCTestService1();
//        ioCTestService2 = new IoCTestService2();
//    }

    @GetMapping("/ioc/test")
    public ResponseEntity<?> testGet() {
        ioCTestService1.t1();
        ioCTestService2.t2();

        return ResponseEntity.ok(null);
    }
}
