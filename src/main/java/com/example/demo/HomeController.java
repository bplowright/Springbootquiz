package com.example.demo;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping ("/")
 public String myHomePage() {
    return "mytemplate";
}

    @RequestMapping("/info")
    public String Info(Model model)
    {
        model.addAttribute("whatisthis", "This is a quiz");

        return "infotemplate";
    }

}
