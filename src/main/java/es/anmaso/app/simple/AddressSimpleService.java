package es.anmaso.app.simple;

import org.springframework.stereotype.Component;

@Component
public class AddressSimpleService {

	Address findAddress(String street) {
		//fake returned data
		return Address.create(street, 1);
	}
	
	Address findAddress(int number) {
		return Address.create("centro", number);
	}
}
