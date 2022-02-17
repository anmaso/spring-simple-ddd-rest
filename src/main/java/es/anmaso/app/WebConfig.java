package es.anmaso.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import es.anmaso.app.ddd.StringToStreetNameConverter;
import es.anmaso.app.ddd.StringToStreetNumberConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new StringToStreetNumberConverter());
		registry.addConverter(new StringToStreetNameConverter());

	}
}