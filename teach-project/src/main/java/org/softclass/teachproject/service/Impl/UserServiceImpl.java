package org.softclass.teachproject.service.Impl;

import org.softclass.teachproject.pojo.DTO.UserDTO;
import org.softclass.teachproject.pojo.DTO.UserVO;
import org.softclass.teachproject.pojo.entity.User;
import org.softclass.teachproject.repository.UserRepository;
import org.softclass.teachproject.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserVO add(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        //调用数据库相关
        User saveUser = userRepository.save(user);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(saveUser,userVO);
        return userVO;

    }
}
