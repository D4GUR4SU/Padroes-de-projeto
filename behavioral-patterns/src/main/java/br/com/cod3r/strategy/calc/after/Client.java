package br.com.cod3r.strategy.calc.after;

import br.com.cod3r.strategy.calc.after.strategies.AddtionOperation;
import br.com.cod3r.strategy.calc.after.strategies.DivisionOperation;
import br.com.cod3r.strategy.calc.after.strategies.MultiplicationOperation;
import br.com.cod3r.strategy.calc.after.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AddtionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
