package com.aws.spring_study.repository;

import com.aws.spring_study.dto.ModifyUserReqDto;
import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// myBatis : xml연결
@Mapper
public interface UserMappers {
    // insert, update, delete query 실행 결과는 숫자!
    public int saveUser(RegisterUserReqDto registerUserReqDto);

    public List<User> getUserListAll();

    public int modifyUser(ModifyUserReqDto modifyUserReqDto);

    public int deleteUser(int userId);
}
