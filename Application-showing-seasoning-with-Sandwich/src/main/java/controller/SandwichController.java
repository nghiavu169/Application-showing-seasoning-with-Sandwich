package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String[] condiment, Model model){
        model.addAttribute("condiment", condiment);
        return "info";
    }
}
