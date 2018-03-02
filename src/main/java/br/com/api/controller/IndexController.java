package br.com.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import br.com.api.auth.Restricao;
import br.com.api.enumeration.TipoRestricao;
import br.com.api.model.Medico;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

    @Inject private Result result;

    @Get("/")
    @Restricao(tipoRestricao=TipoRestricao.ABERTO)
    public void index() throws ParseException {
     
    		result.include("mensagem", "maisPaciente-blank-project-rest :)~");
    	
    	
    		Medico medico = new Medico();
    		
    		medico.setDataNascimento(Calendar.getInstance());
    		
    		medico.setDatanascimento("1991-02-15");
    }
}
