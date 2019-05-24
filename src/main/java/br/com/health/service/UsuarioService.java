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

import br.com.health.entity.Usuario;

@Path("/v1")
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class UsuarioService {
	
	@GET
	@Path("/usuarios")
	@Produces("application/json")
	public String buscarTodasClinicas() {
		try {
			ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();

			Usuario usuario_mock1 = new Usuario();
			usuario_mock1.setId(1);
			usuario_mock1.setNome("Lucas Alberto");
			usuario_mock1.setEmail("lucas@alberto.com");
			lista_usuarios.add(usuario_mock1);
			
			Usuario usuario_mock2 = new Usuario();
			usuario_mock1.setId(2);
			usuario_mock2.setNome("Caio Martins");
			usuario_mock2.setEmail("caio@martins.com");
			lista_usuarios.add(usuario_mock2);
			
			Usuario usuario_mock3 = new Usuario();
			usuario_mock1.setId(3);
			usuario_mock3.setNome("José Ernesto");
			usuario_mock3.setEmail("jose@ernesto.com");
			lista_usuarios.add(usuario_mock3);
			
			Gson gson = new GsonBuilder()
					  .setPrettyPrinting()
					  .excludeFieldsWithoutExposeAnnotation()
					  .serializeNulls()
					  .disableHtmlEscaping()
					  .create();

			String json_usuarios = gson.toJson(lista_usuarios);
			
			return json_usuarios;
		} catch(EntityNotFoundException e) {
			throw new WebApplicationException(404);
		} catch(Exception e) {
			throw new WebApplicationException(500);
		}
	}
}