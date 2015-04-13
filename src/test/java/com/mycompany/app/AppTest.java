package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {
	@Mock
	private Echoable echoable;
	@InjectMocks
	private App app;

	@Test
	public void testApp() {
		assertEquals(7, app.addTwo(5));
	}

	@Test
	public void testEcho() {
		app.echo("Kamehameha!");
		Mockito.verify(echoable).echo("WOLOLO! Kamehameha!");
	}

	@Test
	public void testEchoWithNullArg() {
		app.echo(null);
		Mockito.verify(echoable).echo("WOLOLO! Nothing");
	}
}
