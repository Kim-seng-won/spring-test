package me.firstSpring.controller.Drink;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class UploadViewController {
    @GetMapping("/upload")
    public String getUploadPage(){

        return "Main_page";
    }
    @GetMapping("/코카콜라")
    public String getCokaPage(){
        return "Coke_page";
    }
}
