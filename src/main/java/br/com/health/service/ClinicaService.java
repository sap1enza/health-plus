package br.com.health.service;

import java.util.ArrayList;

import javax.persistence.EntityNotFoundException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.health.entity.Clinica;

@Path("/v1")
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class ClinicaService {
	
	@GET
	@Path("/clinicas")
	@Produces("application/json")
	public String buscarTodasClinicas() {
		try {
			ArrayList<Clinica> lista_clinicas = new ArrayList<Clinica>();

			Clinica clinica_mock1 = new Clinica();
			clinica_mock1.setId(1);
			clinica_mock1.setNome("Saude");
			clinica_mock1.setEspecialidade("Pediatria");
			clinica_mock1.setEndereco("Rua Saude, 123");
			clinica_mock1.setTelefone("1234-5678");
			clinica_mock1.setCep("01234-567");
			lista_clinicas.add(clinica_mock1);
			
			Clinica clinica_mock2 = new Clinica();
			clinica_mock1.setId(2);
			clinica_mock2.setNome("Lins");
			clinica_mock2.setEspecialidade("Geriatria");
			clinica_mock2.setEndereco("Rua Lins, 123");
			clinica_mock2.setTelefone("1234-5678");
			clinica_mock2.setCep("01234-567");
			lista_clinicas.add(clinica_mock2);
			
			Clinica clinica_mock3 = new Clinica();
			clinica_mock1.setId(3);
			clinica_mock3.setNome("Paraiso");
			clinica_mock3.setEspecialidade("Dentista");
			clinica_mock3.setEndereco("Rua Paraiso, 123");
			clinica_mock3.setTelefone("1234-5678");
			clinica_mock3.setCep("01234-567");
			lista_clinicas.add(clinica_mock3);
			
			Gson gson = new GsonBuilder()
					  .setPrettyPrinting()
					  .excludeFieldsWithoutExposeAnnotation()
					  .serializeNulls()
					  .disableHtmlEscaping()
					  .create();
			
			String json_clinicas = gson.toJson(lista_clinicas);
			
			return json_clinicas;
		} catch(EntityNotFoundException e) {
			throw new WebApplicationException(404);
		} catch(Exception e) {
//			String teste = e.toString();
//			return teste;
			throw new WebApplicationException(500);
		}
	}
}