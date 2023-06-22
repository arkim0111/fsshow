package com.myproject.fsshow.show;

import com.myproject.fsshow.common.CommandMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/fsshow")
public class ShowController {

    @Autowired
    private ShowService showService;

    @RequestMapping(value="/showList", method= RequestMethod.GET)
    public ModelAndView showList(Map<String, Object> commandMap) throws Exception{

        ModelAndView mv = new ModelAndView("/show/showList");
        List<Map<String, Object>> list = showService.selectShowList(commandMap);
        mv.addObject("list",list);
        return mv;
    }
}
