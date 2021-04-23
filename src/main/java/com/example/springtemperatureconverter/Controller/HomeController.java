package com.example.springtemperatureconverter.Controller;

import com.example.springtemperatureconverter.Model.Temperature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){ return "home/index"; }
    @PostMapping("/FtoC")
    public String FtoC(@ModelAttribute Temperature temp, Model model){
        model.addAttribute("Temp",temp);
        return "home/FtoC";
    }
    @PostMapping("/CtoF")
    public String CtoF(@ModelAttribute Temperature temp, Model model){
        model.addAttribute("Temp",temp);
        return "home/CtoF";
    }
}
