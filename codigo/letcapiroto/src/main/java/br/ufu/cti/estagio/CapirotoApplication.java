package br.ufu.cti.estagio;


import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.*;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.*;
import org.h2.server.web.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CapirotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapirotoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(CapirotoApplication.class);

	@Bean
	public ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
		registration.addUrlMappings("/console/*");
		return registration;
	}

	@Bean
	public CommandLineRunner demo(final RestauranteDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {


				repository.save(new Restaurante("Umuarama", "Campus Umuarama"));
				repository.save(new Restaurante("STMonica", "Campus Santa Monica"));
											

				// fetch all customers
				log.info(" Buscando restaurantes com findAll():");
				log.info("-------------------------------");
				for (Restaurante restaurante : repository.findAll()) {
					log.info(restaurante.toString());
				}
			}
		};

		return commandLineRunner;
	}
	
	
	


}
