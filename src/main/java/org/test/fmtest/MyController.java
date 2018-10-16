package org.test.fmtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by jetbrains
 */
@Controller
public class MyController {

    @RequestMapping(path = "/")
    public String home(Model model){
        model.addAttribute("home_attribute1","hello!");
        return "home";
    }
}
