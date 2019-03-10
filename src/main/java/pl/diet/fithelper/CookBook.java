package pl.diet.fithelper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class CookBook {
    private final RecipeRepository recipeRepository;

    public CookBook(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @PostMapping("/addRecipe")
    void addRecipeFromFileToCookBook(
            @RequestParam(defaultValue = "ingredients.csv") String fileName,
            @RequestParam String fileLocation) throws IOException {
    }

    @GetMapping("/findRecipe")
    void findRecipeByName(@RequestParam String recipeName, @RequestParam(defaultValue = "0") int kcalInMeal) {
        recipeRepository.findByRecipeNameOrKcalInMeal(recipeName, kcalInMeal);
    }
}
