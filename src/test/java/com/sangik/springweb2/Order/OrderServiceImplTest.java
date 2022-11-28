package com.sangik.springweb2.Order;

import com.sangik.springweb2.Discount.FixedDiscountPolicy;
import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;
import com.sangik.springweb2.Member.MemoryMemberRepository;
import com.sangik.springweb2.order.Order;
import com.sangik.springweb2.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixedDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}