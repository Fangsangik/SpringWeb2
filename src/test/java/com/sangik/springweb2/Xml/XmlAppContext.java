package com.sangik.springweb2.Xml;

import com.sangik.springweb2.Member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {

    @Test
    void xlmAppContext(){
        ApplicationContext ac= new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService= ac.getBean("memberService", MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
