package com.sapient.hybris.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageBuilderTest {

@Test
 public void testGetMessageForValidName() {
	MessageBuilder messageBuilder= new MessageBuilder();
	assertEquals("Hello Srini",messageBuilder.getMessage("Srini"));
}

@Test
public void testGetMessageForInValidName() {
	MessageBuilder messageBuilder= new MessageBuilder();
	assertNotEquals("Hello Admin",messageBuilder.getMessage("Srini"));
}

@Test
public void testGetMessageForNull() {
	MessageBuilder messageBuilder= new MessageBuilder();
	assertEquals("Please provide a name!",messageBuilder.getMessage(null));
}

}
