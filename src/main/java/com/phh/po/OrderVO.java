package com.phh.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述
 *
 * @author phh
 * @version V1.0
 * @date 2019/7/28
 */
@Data
public class OrderVO implements Serializable {

    private static final long serialVersionUID = 1486608127642311846L;

    private Long orderId;

    private Long userId;

    private Date createAt;

    private Double amount;


}
