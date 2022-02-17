package es.anmaso.app.ddd;

import org.springframework.core.convert.converter.Converter;

public class StringToStreetNumberConverter implements Converter<String, StreetNumber> {

	@Override
	public StreetNumber convert(String number) {
		return StreetNumber.create(Integer.valueOf(number));
	}
}