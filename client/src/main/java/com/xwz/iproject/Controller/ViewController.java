package com.xwz.iproject.Controller;

import com.xwz.iservice.Controller.ServiceController;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@RequestMapping(value = "/view")
public class ViewController {

    @RequestMapping(value = "/home")
    public String goToHomeView(){
        String str = ServiceController.getServiceStr();
        System.out.println(str);
        return "home";
    }
}
