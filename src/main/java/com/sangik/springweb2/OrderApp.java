package com.sangik.springweb2;

import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;
import com.sangik.springweb2.Member.MemberService;
import com.sangik.springweb2.Member.MemberServiceImpl;
import com.sangik.springweb2.order.Order;
import com.sangik.springweb2.order.OrderService;
import com.sangik.springweb2.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order= " + order);
        System.out.println("order= " + order.calculatePrice());
    }
}
