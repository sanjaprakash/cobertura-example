package com.mycompany.app;

import org.junit.Test;

public class DefaultEchoableTest {
	private Echoable echoable = new DefaultEchoable();

	@Test(expected = RuntimeException.class)
	public void testEcho() {
		echoable.echo("something");
	}

}
