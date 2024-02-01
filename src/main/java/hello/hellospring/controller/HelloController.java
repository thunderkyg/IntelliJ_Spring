package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("date", "hello!!");
        return "hello";
    }

    @GetMapping("modelandview")
    public ModelAndView hello(HttpServletRequest req, HttpServletResponse res) {

        return new ModelAndView("index.html");
    }



}
