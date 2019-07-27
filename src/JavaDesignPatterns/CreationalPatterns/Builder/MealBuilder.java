package JavaDesignPatterns.CreationalPatterns.Builder;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class MealBuilder {

    public Meal PrepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;


    }
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
