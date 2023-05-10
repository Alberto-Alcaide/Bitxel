package services.Equip;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import dao.Equip.Equip;

public class TestServletEquip {

	@Test
	public void testServlets() throws IOException, ServletException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		
		
		when(request.getParameter("name")).thenReturn("Axe");
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		
		when(response.getWriter()).thenReturn(writer);
		
		
		new PostEquipServlet().doPost(request,response);
		
		System.out.println(stringWriter);
		
		// JSON con la respuesta
		
		JSONObject resultado = new JSONObject(stringWriter.toString());
		/*
		 * resultado.get()
			resultado.put("code", "ERROR");
			resultado.put("mensaje", "Listado Vacío");
			resultado.put("resultado", stringWriter);
		*/
	
		resultado.put("code", "ok");
		resultado.put("mensaje", "ok");
		resultado.put("resultado", stringWriter);
		
		
		try
		{
			writer.write(resultado.toString());
		} finally
		{
			writer.close();
		}
		
		//Meter Json, como en el post.  code, mensaje, resultado.
		// Conectar a base datos (No prioritario)
	}
}
