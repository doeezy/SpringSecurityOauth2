package com.sample.app.user.mapper;

import com.sample.app.user.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper {
    public UserDto checkDuplicateNickname(@Param("nickname") String nickname) throws Exception;
    public UserDto checkDuplicateLoginId(@Param("loginId") String loginId) throws Exception;
}
