package com.crc.back.project.mapper;

import com.crc.back.project.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: chenrencun
 * @Date: 2019/12/9 16:56
 * @Description: 描述
 */
@Repository
public interface UserMapper {

    List<User> findList();

}
