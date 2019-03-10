package pl.diet.fithelper;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
    List<Recipe> findByRecipeNameOrKcalInMeal(String recipeName, int kcalInMeal);
}
