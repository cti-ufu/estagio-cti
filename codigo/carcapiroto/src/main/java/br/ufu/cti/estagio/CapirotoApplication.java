package br.ufu.cti.estagio;

import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.DataRefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.ItemRefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RestauranteDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.TipoItemRefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.TurnoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.DataRefeicao;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.ItemRefeicao;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Refeicao;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Restaurante;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.TipoItemRefeicao;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Turno;

import java.util.Iterator;

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
	public CommandLineRunner dadosRestaurante(final RestauranteDAO repository) {

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
	
	public CommandLineRunner dadosRefeicao(final RefeicaoDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {


				repository.save(new Refeicao("Galinhada"));
				repository.save(new Refeicao("Lasanha"));
				
				

				// fetch all customers
				log.info(" Buscando refeicoes com findAll():");
				log.info("-------------------------------");
				for (Refeicao refeicao : repository.findAll()) {
					log.info(refeicao.toString());
				}
			}
		};

		return commandLineRunner;
	}
	
	public CommandLineRunner dadosDataRefeicao(final DataRefeicaoDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {


				repository.save(new DataRefeicao("05/05/2016"));
				repository.save(new DataRefeicao("06/05/2016"));
				
				

				// fetch all customers
				log.info(" Buscando refeicoes com findAll():");
				log.info("-------------------------------");
				for (DataRefeicao dataRefeicao : repository.findAll()) {
					log.info(dataRefeicao.toString());
				}
			}
		};

		return commandLineRunner;
	}
	
	public CommandLineRunner dadosTurno(final TurnoDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {


				repository.save(new Turno("06:45" , "08:00", "Café da manhã"));
				repository.save(new Turno("10:30" , "13:30", "Almoço"));
				repository.save(new Turno("17:45" , "19:15", "Jantar"));
				
				

				// fetch all customers
				log.info(" Buscando refeicoes com findAll():");
				log.info("-------------------------------");
				for (Turno turno : repository.findAll()) {
					log.info(turno.toString());
				}
			}
		};

		return commandLineRunner;
	}
	
	public CommandLineRunner dadosTipoItemRefeicao(final TipoItemRefeicaoDAO repository) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				

				repository.save(new TipoItemRefeicao("Prato Principal"));
				repository.save(new TipoItemRefeicao("Prato Vegetariano"));
				

				// fetch all customers
				log.info(" Buscando refeicoes com findAll():");
				log.info("-------------------------------");
				for (TipoItemRefeicao tipoItemRefeicao : repository.findAll()) {
					log.info(tipoItemRefeicao.toString());
				}
			}
		};

		return commandLineRunner;
	}
	
	public CommandLineRunner dadosItemRefeicao(final ItemRefeicaoDAO repository , final TipoItemRefeicaoDAO repositoryItemRefeicao) {

		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {

				/*Iterable<TipoItemRefeicao> iterable = repositoryItemRefeicao.findAll();
				Iterator<TipoItemRefeicao> it = iterable.iterator();
				
				TipoItemRefeicao tipoItemRefeicao = it.next();
				*/
				
				Iterable<TipoItemRefeicao> iterable = repositoryItemRefeicao.getOne()
				
				repository.save(new ItemRefeicao("Filé de frango grelhado", tipoItemRefeicao));
				repository.save(new ItemRefeicao("Estrogonofe bovino", tipoItemRefeicao));
				repository.save(new ItemRefeicao("Omelete de forno", tipoItemRefeicao));
				repository.save(new ItemRefeicao("Estrogonofe vegetariano", tipoItemRefeicao));
				

				// fetch all customers
				log.info(" Buscando refeicoes com findAll():");
				log.info("-------------------------------");
				for (ItemRefeicao itemRefeicao : repository.findAll()) {
					log.info(itemRefeicao.toString());
				}
			}
		};

		return commandLineRunner;
	}
	
}
