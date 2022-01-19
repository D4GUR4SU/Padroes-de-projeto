package br.com.cod3r.builder.meal.fluent;

import br.com.cod3r.builder.meal.fluent.model.FastFoodMeal;
import br.com.cod3r.builder.meal.fluent.model.builder.FastFoodMealBuilder;

public class Client {
	
	public static void main(String[] args) {
		FastFoodMeal burgerCombo = new FastFoodMealBuilder("Fries")
				.andMain("Cheese Burger")
				.forDrink("Coke")
				.thatsAll();
		System.out.println(burgerCombo);
		
		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);
		
		FastFoodMeal heartComboAttack = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burger")
				.forDrink("Milk Shake")
				.andDessert("Chocolate Cake")
				.andGift("2 Kilogramas")
				.thatsAll();
		System.out.println(heartComboAttack);
	}
}
