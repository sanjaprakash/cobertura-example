package com.mycompany.app;

public class App {

	private final Echoable echoable;

	public App() {
		this.echoable = new DefaultEchoable();
	}

	public App(Echoable echoable) {
		this.echoable = echoable;
	}

	public int addTwo(int foo) {
		return foo + 2;
	}

	public void echo(String something) {
		final String toEcho = something == null ? "Nothing" : something;
		echoable.echo("WOLOLO! " + toEcho);
	}
}
