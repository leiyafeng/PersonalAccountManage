package cn.lyf.account.controller;

import cn.lyf.account.interceptor.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/personal")
public class PersonalController {

    //@Auth
    @RequestMapping("/")
    public String personalIndex(){
        return "/workbench/personal/personal";
    }

}