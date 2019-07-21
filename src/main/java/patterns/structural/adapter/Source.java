package patterns.structural.adapter;

import patterns.structural.decorator.Sourceable;

public class Source implements Sourceable{

	public void method(){
		System.out.println("------------>Source.method()");
	}
}
