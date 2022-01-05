package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author cyp
 * @create 2021-12-29 14:53
 */
@Component //必须要注入!!!
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back paymentInfo_OK";
    }
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall back paymentInfo_TimeOut";
    }
}

