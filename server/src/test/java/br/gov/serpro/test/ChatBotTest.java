package br.gov.serpro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.gov.serpro.ChatBot;

public class ChatBotTest {
	
	@Test
	public void should_say_hello() {
		ChatBot bot = new ChatBot();
		
		assertEquals("Hello Human!", bot.getMsg("Hello Bot"));
	}
}
