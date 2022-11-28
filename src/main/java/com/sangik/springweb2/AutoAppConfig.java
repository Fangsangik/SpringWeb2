package com.sangik.springweb2;

import com.sangik.springweb2.Discount.DiscountPolicy;
import com.sangik.springweb2.Member.MemberRepository;
import com.sangik.springweb2.Member.MemoryMemberRepository;
import com.sangik.springweb2.order.Order;
import com.sangik.springweb2.order.OrderService;
import com.sangik.springweb2.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    /*
    @Bean(name = "memoryMemberRepository")

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

     */
}

