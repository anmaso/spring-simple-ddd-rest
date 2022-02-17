package es.anmaso.app.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressSimpleController {

	@Autowired
	AddressSimpleService service;
	
	@GetMapping("/street/simple")
	public Address getStreet(
			@RequestParam(value = "street", required = true) String street,
			@RequestParam(value = "number", required = true) int number) {
		
		return street!=null?  service.findAddress(street): service.findAddress(number);
	}
}
