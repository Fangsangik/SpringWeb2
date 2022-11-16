package com.sangik.springweb2.Order;

import com.sangik.springweb2.AppConfig;
import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;
import com.sangik.springweb2.Member.MemberService;
import com.sangik.springweb2.Member.MemberServiceImpl;
import com.sangik.springweb2.order.Order;
import com.sangik.springweb2.order.OrderService;
import com.sangik.springweb2.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        Long memberId = 1l;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}
