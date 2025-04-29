package org.softclass.teachproject.service;

import org.softclass.teachproject.pojo.DTO.UserDTO;
import org.softclass.teachproject.pojo.entity.User;

public interface UserService {
    /**
     * 添加用户
     * @param userDTO
     */
    User add(UserDTO userDTO);
}
