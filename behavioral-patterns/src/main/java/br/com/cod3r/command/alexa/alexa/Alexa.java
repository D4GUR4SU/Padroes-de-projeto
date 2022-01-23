package br.com.cod3r.command.alexa.alexa;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.command.alexa.commands.Command;

public class Alexa {
	private Map<String, Object> integrations;
	private AlexaAI ai;

	public Alexa() {
		integrations = new HashMap<String, Object>();
		ai = new AlexaAI();
	}

	public void addIntegration(String key, Command command, String... keywords) {
		integrations.put(key, command);
		ai.addAssociation(key, keywords);
	}

	public void sendRequest(String request) {
		Command command = (Command) integrations.get(request);
		if (command == null) {
			String key = ai.getFindAssociations(request);
			command = (Command) integrations.get(key);
			if (command == null) {
				System.out.println("Sorry I can't perform your request!");
				return;
			}
		}
		System.out.println("Send a generic command as you saved in my configuration");
		command.execute();
	}
}
