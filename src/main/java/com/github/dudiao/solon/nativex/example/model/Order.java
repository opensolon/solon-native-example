package com.github.dudiao.solon.nativex.example.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author noear 2023/4/27 created
 */
@Data
@Accessors(fluent = true)
public class Order implements Serializable {
    private long orderId;
    private Date created;
}
