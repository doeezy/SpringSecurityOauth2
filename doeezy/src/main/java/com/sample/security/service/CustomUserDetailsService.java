package com.sample.security.service;

import com.sample.app.user.dto.UserDto;
import com.sample.common.exception.CustomException;
import com.sample.security.dto.UserDetailsDto;
import com.sample.security.mapper.AuthMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final AuthMapper authMapper;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String nickname) throws UsernameNotFoundException{
        UserDto user = authMapper.findUserInfoByNickname(nickname);
        if(user == null) {
            throw new CustomException("해당 사용자 정보가 없습니다.");
        }
        return UserDetailsDto.build(user);
    }
}