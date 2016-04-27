package br.ufu.cti.estagio;


import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.*;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.*;


import java.time.LocalDate;
import java.time.LocalTime;

import org.h2.server.web.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

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
	
	/*
	
	@Bean
	public CommandLineRunner demo(final TurnoDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {

				repository.save(new Turno(LocalTime.of(7, 0), LocalTime.of(9, 0), "Café da Manhã"));
				repository.save(new Turno(LocalTime.of(7, 0), LocalTime.of(9, 0), "Café da Manhã"));
									
							

				// fetch all customers
				log.info(" Buscando turnos com findAll():");
				log.info("-------------------------------");
				for (Turno turno : repository.findAll()) {
					log.info(turno.toString());
				}
			}
		};

		return commandLineRunner;
	}
	@Bean
	public CommandLineRunner demo(final DataRefeicaoDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {

				repository.save(new DataRefeicao(LocalDate.of(2016, 4, 27)));
				repository.save(new DataRefeicao(LocalDate.of(2016, 4, 27)));
									
							

				// fetch all customers
				log.info(" Buscando DataRefeicao com findAll():");
				log.info("-------------------------------");
				for (DataRefeicao DataRefeicao : repository.findAll()) {
					log.info(DataRefeicao.toString());
				}
			}
		};

		return commandLineRunner;
	}*/



}
