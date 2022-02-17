package es.anmaso.app.ddd;

import java.io.IOException;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@JsonComponent
public class AddressJsonSerializer extends JsonSerializer<Address> {

	@Override
	public void serialize(Address address, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {

		jsonGenerator.writeStartObject();
		jsonGenerator.writeStringField("name", address.getName().getName());
		jsonGenerator.writeNumberField("number", address.getNumber().getNumber());
		jsonGenerator.writeEndObject();
	}

}