package services.Equip;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServletEquip {

	
	public void testServlets() throws IOException, ServletException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		
		HttpServletResponse response2 = mock(HttpServletResponse.class);
		
		when(request.getParameter("name")).thenReturn("280");
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		
		when(response.getWriter()).thenReturn(writer);
		
		//new fitraEquipRango().doGet(request,response);
		
		System.out.println(stringWriter.toString());
	}
}
