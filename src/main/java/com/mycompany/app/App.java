package com.mycompany.app;

public class App {

	private Echoable echoable;

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

	public Echoable getEchoable() {
		return echoable;
	}

	public void setEchoable(Echoable echoable) {
		this.echoable = echoable;
	}

}
