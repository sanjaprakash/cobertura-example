package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	private App app = new App();

	@Test
	public void testApp() {
		assertEquals(7, app.addTwo(5));
	}
}
