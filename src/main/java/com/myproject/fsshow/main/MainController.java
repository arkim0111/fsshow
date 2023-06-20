package com.myproject.fsshow.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value="")
    public String index(Model model) {
        model.addAttribute("data", "FSSHOW MAIN PAGE :)");
        return "index";
    }
}
