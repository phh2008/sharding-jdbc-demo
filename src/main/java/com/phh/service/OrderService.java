package com.phh.service;

import com.phh.po.OrderVO;
import com.phh.repo.OrderDAO;
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
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;


    public void add(OrderVO orderVO) {
        orderDAO.insert(orderVO);
    }

    public OrderVO getById(Long id) {
        return orderDAO.getById(id);
    }

    public List<OrderVO> query(Map<String, Object> param) {
        return orderDAO.query(param);
    }

}
