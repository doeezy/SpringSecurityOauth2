package com.sample.app.user.service;

import com.sample.app.user.dto.UserDto;
import com.sample.app.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserMapper userMapper;

    public UserDto checkDuplicateNickname(String nickname) throws Exception {
        return userMapper.checkDuplicateNickname(nickname);
    }

    public UserDto checkDuplicateLoginId(String loginId) throws Exception {
        return userMapper.checkDuplicateLoginId(loginId);
    }
}
