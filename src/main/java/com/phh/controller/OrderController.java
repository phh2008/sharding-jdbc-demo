package com.phh.controller;

import com.phh.po.OrderVO;
import com.phh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 描述
 *
 * @author phh
 * @version V1.0
 * @date 2019/7/28
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("add")
    public Object add() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderId(random.nextLong(1000000000));
        orderVO.setAmount(random.nextDouble(10000D));
        orderVO.setCreateAt(new Date());
        orderVO.setUserId(random.nextLong(1000));
        orderService.add(orderVO);
        return "ok";
    }

    @GetMapping("/{id}")
    public OrderVO getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @GetMapping("/query")
    public List<OrderVO> query(@RequestParam Map<String, Object> param) {
        return orderService.query(param);
    }


}
