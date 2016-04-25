package br.ufu.cti.estagio;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RestauranteDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Restaurante;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Refeicao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CapirotoApplication.class)
@WebAppConfiguration
public class CapirotoApplicationTests {

	@Autowired
	RestauranteDAO restauranteDAO;
	RefeicaoDAO refeicaoDAO;

	@Test
	public void contextLoads() {
		restauranteDAO.save(new Restaurante("Umuarama", "Campus Umuarama"));
		restauranteDAO.save(new Restaurante("STMonica", "Campus Santa Monica"));
		
		for (Restaurante restaurante : restauranteDAO.findAll()) {
			assertNotNull(restaurante);
		}
			
		
		
	}




}

