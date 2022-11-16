package com.sangik.springweb2;

import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;
import com.sangik.springweb2.Member.MemberService;
import com.sangik.springweb2.Member.MemberServiceImpl;
import com.sangik.springweb2.order.Order;
import com.sangik.springweb2.order.OrderService;
import com.sangik.springweb2.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
        //OrderService orderService = appConfig.orderService();
        //MemberService memberService = new MemberServiceImpl();
        //OrderService orderService = new OrderServiceImpl();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order= " + order);
        System.out.println("order= " + order.calculatePrice());
    }
}
