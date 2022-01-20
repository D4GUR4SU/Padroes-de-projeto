package br.com.cod3r.bridge.backend.dao;

import br.com.cod3r.bridge.backend.model.User;

public class UserMongoDao implements UserDao {

	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
