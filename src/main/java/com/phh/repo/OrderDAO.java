package com.phh.repo;

import com.phh.po.OrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author phh
 * @version V1.0
 * @date 2019/7/28
 */
public interface OrderDAO {

    void insert(OrderVO orderVO);

    OrderVO getById(@Param("id") Long id);

    List<OrderVO> query(Map<String, Object> param);

}
