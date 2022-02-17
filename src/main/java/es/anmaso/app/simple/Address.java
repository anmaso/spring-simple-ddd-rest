package es.anmaso.app.simple;

public class Address {

	private String name;
	private int number;

	private Address(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public static Address create(String name, int number) {
		return new Address(name, number);
	}
}
