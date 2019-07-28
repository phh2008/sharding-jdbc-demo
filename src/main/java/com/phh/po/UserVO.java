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
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1846928193136115341L;

    private Long id;

    private String username;

    private String password;

    private String realname;

    private Integer state;

    private Date createAt;
}
