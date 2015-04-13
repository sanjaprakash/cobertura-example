package com.mycompany.app;

public class DefaultEchoable implements Echoable {

	@Override
	public void echo(String something) {
		System.out.println(something);
	}

}
