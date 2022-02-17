package es.anmaso.app.ddd;

import org.springframework.stereotype.Component;

@Component
public class AddressService {

	Address findAddress(StreetNumber number) {
		return Address.create("centro", number.getNumber());
	}
	
	Address findAddress(StreetName name) {
		return Address.create(name.getName(), 1);
	}
}
