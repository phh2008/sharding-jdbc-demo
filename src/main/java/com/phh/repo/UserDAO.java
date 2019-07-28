package com.phh.repo;

import com.phh.po.UserVO;

import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author phh
 * @version V1.0
 * @date 2019/7/28
 */
public interface UserDAO {


    List<UserVO> query(Map<String, Object> param);

}
