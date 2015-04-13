package com.mycompany.app;

public class App {

	private Echoable echoable;

	public int addTwo(int foo) {
		return foo + 2;
	}

	public void echo(String something) {
		echoable.echo("WOLOLO! " + something);
	}
}
