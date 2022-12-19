package com.sangik.springweb2.Web;

import com.sangik.springweb2.Common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Retention;

@Controller
@RequiredArgsConstructor //생성자에 자동으로 Autowired 들어감
public class LogDemoController {

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;

    @RequestMapping("log-demo")
    @ResponseBody //문자를 그대로 보낼 수 있다.
    public String logDemo(HttpServletRequest request) throws InterruptedException{
        String requestURL = request.getRequestURL().toString();
        System.out.println("myLogger = " + myLogger.getClass());
        myLogger.setRequestURL(requestURL);
        myLogger.log("controller test");
        logDemoService.logic("testId");
        return "Ok";
    }
}
