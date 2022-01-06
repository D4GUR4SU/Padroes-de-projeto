package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory iphoneXFactory = new IPhoneXFactory(rules);
		IPhoneFactory iphone11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an Iphone X");
		IPhone iphone = iphoneXFactory.orderIPhone("standard");
		System.out.println(iphone); 
		
		System.out.println("### Ordering an Iphone 11 HighEnd");
		IPhone iphone2 = iphone11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
