package org.tnsif.autowiredexample;

public class Cake {
	Bread b;

	public void setB(Bread b) {
		this.b = b;
	}
	public void accept()
	{
		b.breadbrown();
	}

}
