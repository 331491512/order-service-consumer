package com.atguigu.gmall.service.impl;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

public class OrderServiceImpl implements OrderService {

    
    UserService userService;
    
    public void initOrder(String userId) {
        // 1、查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }

}
