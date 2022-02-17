package es.anmaso.app.ddd;

import java.io.Serializable;

public class StreetNumber implements Serializable{

	private static final long serialVersionUID = 2290186971224685792L;
	
	private int number;
	
	private StreetNumber(int number) {
		if (number<0) {
			throw new IllegalArgumentException("Invalid street number:"+number);
		}
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static StreetNumber create(int number) {
		return new StreetNumber(number);
	}
		
}
