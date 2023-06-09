package com.sample.security.mapper;

import com.sample.app.user.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository("authMapper")
public interface AuthMapper {
    Integer insertSignUpUser(UserDto params) throws Exception;
    Integer insertSignUpUserAuthInfo(UserDto params) throws Exception;
    UserDto getUserInfo(UserDto params) throws Exception;
    UserDto findUserInfoByLoginId(@Param("loginId") String loginId) throws Exception;
    UserDto findUserInfoByNickname(@Param("nickname") String nickname) throws UsernameNotFoundException;
}
