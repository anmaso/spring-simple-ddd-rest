package es.anmaso.app.ddd;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 2161990495963192826L;

	private StreetName name;
	private StreetNumber number;
	
	private Address(String name, int number) {
		this.name=StreetName.create(name);
		this.number=StreetNumber.create(number);
	}
	
	public StreetName getName() {
		return name;
	}

	public StreetNumber getNumber() {
		return number;
	}

	public static Address create(String name, int number) {
		return new Address(name, number);
	}
		
}
