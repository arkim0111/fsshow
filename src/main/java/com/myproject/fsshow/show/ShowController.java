package com.myproject.fsshow.show;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("data", "FSSHOW MAIN PAGE :)");
        return "index";
    }
}
