package es.anmaso.app.ddd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressDDDController {

	@Autowired
	AddressService service;
	
	@GetMapping("/street/ddd")
	public Address getStreet(
			@RequestParam(value = "street", required = false) StreetName street,
			@RequestParam(value = "number", required = false) StreetNumber number) {
		
		return street!=null? service.findAddress(street): service.findAddress(number);
	}
}
