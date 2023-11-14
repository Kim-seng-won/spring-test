package me.firstSpring.controller.Drink;

import lombok.RequiredArgsConstructor;
import me.firstSpring.domain.Drink;
import me.firstSpring.dto.Article.ArticleViewResponse;
import me.firstSpring.dto.Drink.DrinkListViewResponse;
import me.firstSpring.dto.Drink.DrinkViewResponse;
import me.firstSpring.service.DrinkService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class DrinkViewController {
    private final DrinkService drinkService;

    @GetMapping("/drink")
    public String getDrink(Model model){ //Model : HTML쪽으로 값을 넘겨주는 객체
        List<DrinkListViewResponse> drinks = drinkService.findAll().stream()
                .map(DrinkListViewResponse::new)
                .toList();
        model.addAttribute("drink",drinks);

        return "drinkList";
    }
    @GetMapping("/drink/{id}")
    public String getArticle(@PathVariable Long id, Model model){
        Drink drink = drinkService.findById(id);
        model.addAttribute("drink",new DrinkViewResponse(drink));
        return "drink";
    }
    @GetMapping("/upload/{name}")
    public String getContent(@PathVariable String name, Model model){
        Drink drink = drinkService.findByName(name);
        model.addAttribute("data", new DrinkViewResponse(drink));
        return "data";
    }

    @GetMapping("/new-drink")
    //id 키를 가진 쿼리 파라미터의 값을 id변수에 매핑
    public String newArticle(@RequestParam(required = false) Long id, Model model){
        if(id == null){ //id가 없으면 생성
            model.addAttribute("drink", new ArticleViewResponse());
        } else{ //있으면 수정
            Drink drink = drinkService.findById(id);
            model.addAttribute("drink", new DrinkViewResponse(drink));
        }
        return "newdrink";
    }
}