package store.kanggyeonggu.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping({"/"})
    public String index() {         
        return "index";                
    }

    @GetMapping({"/auth/login"})
    public String login() {
        return "auth/login";
    }

    @GetMapping({"/auth/register"})
    public String register() {
        return "auth/register";
    }
}
