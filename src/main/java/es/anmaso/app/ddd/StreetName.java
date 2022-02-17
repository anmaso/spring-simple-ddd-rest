package es.anmaso.app.ddd;

import java.io.Serializable;

public class StreetName implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	
	private StreetName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public static StreetName create(String name) {
		return new StreetName(name);
	}
		
}
