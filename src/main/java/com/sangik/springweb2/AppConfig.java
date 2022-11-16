package com.sangik.springweb2;


import com.sangik.springweb2.Discount.DiscountPolicy;
import com.sangik.springweb2.Discount.FixedDiscountPolicy;
import com.sangik.springweb2.Discount.RateDiscountPolicy;
import com.sangik.springweb2.Member.MemberService;
import com.sangik.springweb2.Member.MemberServiceImpl;
import com.sangik.springweb2.Member.MemoryMemberRepository;
import com.sangik.springweb2.order.OrderService;
import com.sangik.springweb2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
