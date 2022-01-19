package br.com.cod3r.builder.meal.functional;

import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burgerCombo = new FastFoodMeal.Builder("Fries")
				.andMain("Cheese Burger")
				.forDrink("Coke")
				.thatsAll();
		System.out.println(burgerCombo);
		
		FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
		System.out.println(justFries);
		
		FastFoodMeal heartComboAttack = new FastFoodMeal.Builder("Large Fries")
				.andMain("Monster Burger")
				.forDrink("Milk Shake")
				.andDessert("Chocolate Cake")
				.andGift("2 Kilogramas")
				.thatsAll();
		System.out.println(heartComboAttack);
	}
}
