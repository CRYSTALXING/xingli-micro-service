package com.xingli.payment.service;

import com.xingli.common.entity.po.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(@Param("payment") Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
