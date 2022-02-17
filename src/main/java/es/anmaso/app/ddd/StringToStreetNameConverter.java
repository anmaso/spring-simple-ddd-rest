package es.anmaso.app.ddd;

import org.springframework.core.convert.converter.Converter;

public class StringToStreetNameConverter implements Converter<String, StreetName> {

	@Override
	public StreetName convert(String name) {
		return StreetName.create(name);
	}
}