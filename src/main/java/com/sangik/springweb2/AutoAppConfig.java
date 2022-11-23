package com.sangik.springweb2;

import com.sangik.springweb2.Member.MemberRepository;
import com.sangik.springweb2.Member.MemoryMemberRepository;
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

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
     */
}

