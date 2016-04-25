package br.ufu.cti.estagio.br.ufu.cti.estagio.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.TipoItemRefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.TipoItemRefeicao;

@RestController
public class TipoItemRefeicaoRest {

	@Autowired
    TipoItemRefeicaoDAO tipoItemRefeicaoDAO;
	
	@RequestMapping("/buscarTipoItemRefeicao")
    public List<TipoItemRefeicao> buscarTipoItemRefeicao () {
    	
        List<TipoItemRefeicao> tipoItemRefeicoes = new ArrayList<>();

        for (TipoItemRefeicao tipoItemRefeicao : tipoItemRefeicaoDAO.findAll()) {
        	tipoItemRefeicoes.add(tipoItemRefeicao);
        }

        return tipoItemRefeicoes;

    }
}
