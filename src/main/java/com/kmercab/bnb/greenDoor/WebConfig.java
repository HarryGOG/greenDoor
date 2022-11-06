package com.kmercab.bnb.greenDoor;
import javax.servlet.http.HttpServlet;

import com.kmercab.bnb.greenDoor.servlet.HelloIncomingCallServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebConfig {
    @Bean
    public ServletRegistrationBean<HttpServlet> incomingCallServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet((HttpServlet) new HelloIncomingCallServlet());
        servRegBean.addUrlMappings("/voice/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}
