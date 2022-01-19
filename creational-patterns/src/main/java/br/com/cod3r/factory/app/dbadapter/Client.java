package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		
		DB oracle = new OracleFactory().getDatabase();
		DB postgres = new PostgresFactory().getDatabase();
		
		oracle.query("SELECT * FROM users");
		oracle.update("INSERT INTO users VALUES ('User', 25)");
		
		postgres.query("SELECT * FROM users");
		postgres.update("INSERT INTO users VALUES ('User', 25)");
	}
}
