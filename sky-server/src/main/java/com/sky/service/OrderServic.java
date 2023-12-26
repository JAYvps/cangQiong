package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

public interface OrderServic {
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
