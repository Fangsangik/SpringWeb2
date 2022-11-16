package com.sangik.springweb2;

import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;
import com.sangik.springweb2.Member.MemberService;
import com.sangik.springweb2.Member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
       // AppConfig appConfig = new AppConfig();
       // MemberService memberService = appConfig.memberService();// MemberService memberService = new MemberServiceImpl();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member =" + findMember.getName());
    }
}
