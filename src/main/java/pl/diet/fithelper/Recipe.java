package pl.diet.fithelper;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Recipe {

//    public Recipe() {
//
//    }

    @Id
    @GeneratedValue
    private Integer id;
    private String recipeName;
    private String ingredientName;
    private String measureUnit;
    private int valueOfMeasureUnit;
    private int kcalInMeal;
//
//
//    public Recipe(String recipeName, String ingredientName, String measureUnit, int valueOfMeasureUnit, int kcalInMeal) {
//        this.recipeName = recipeName;
//        this.ingredientName = ingredientName;
//        this.measureUnit = measureUnit;
//        this.valueOfMeasureUnit = valueOfMeasureUnit;
//        this.kcalInMeal = kcalInMeal;
//    }
//
//    public String getRecipeName() {
//        return recipeName;
//    }
//
//    public void setRecipeName(String recipeName) {
//        this.recipeName = recipeName;
//    }
//
//    public String getIngredientName() {
//        return ingredientName;
//    }
//
//    public void setIngredientName(String ingredientName) {
//        this.ingredientName = ingredientName;
//    }
//
//    public String getMeasureUnit() {
//        return measureUnit;
//    }
//
//    public void setMeasureUnit(String measureUnit) {
//        this.measureUnit = measureUnit;
//    }
//
//    public int getValueOfMeasureUnit() {
//        return valueOfMeasureUnit;
//    }
//
//    public void setValueOfMeasureUnit(int valueOfMeasureUnit) {
//        this.valueOfMeasureUnit = valueOfMeasureUnit;
//    }
//
//    public int getKcalInMeal() {
//        return kcalInMeal;
//    }
//
//    public void setKcalInMeal(int kcalInMeal) {
//        this.kcalInMeal = kcalInMeal;
//    }
//
//    @Override
//    public String toString() {
//        return "Recipe{" +
//                "id=" + id +
//                ", recipeName='" + recipeName + '\'' +
//                ", ingredientName='" + ingredientName + '\'' +
//                ", measureUnit='" + measureUnit + '\'' +
//                ", valueOfMeasureUnit=" + valueOfMeasureUnit +
//                ", kcalInMeal=" + kcalInMeal +
//                '}';
//    }
}
