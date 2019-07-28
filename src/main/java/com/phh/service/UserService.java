package com.phh.service;

import com.phh.po.UserVO;
import com.phh.repo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author phh
 * @version V1.0
 * @date 2019/7/28
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<UserVO> query(Map<String, Object> param) {
        return userDAO.query(param);
    }

}
