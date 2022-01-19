package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		ServicesAbstractFactory factory = new EJBAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Douglas");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Sorento");
		carService.update("BMW X5");
	}
}
