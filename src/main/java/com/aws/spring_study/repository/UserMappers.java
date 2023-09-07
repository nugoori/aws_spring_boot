package com.aws.spring_study.repository;

import com.aws.spring_study.dto.RegisterUserReqDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMappers {
    // insert, update, delete query 실행 결과는 숫자!
    public int saveUser(RegisterUserReqDto registerUserReqDto);
}
