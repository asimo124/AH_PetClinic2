package info.alexhawley.petclinic2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {

        return "index";
    }

    @RequestMapping("/oups")
    public String getOops() {

        return "notimplemented";
    }
}
