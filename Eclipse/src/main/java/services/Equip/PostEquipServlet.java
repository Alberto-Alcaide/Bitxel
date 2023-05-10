package services.Equip;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import dao.Equip.Equip;
import manager.Equip.ConsultaEquip;

/**
 * Servlet implementation class PostEquipServlet
 */
@WebServlet("/PostEquip")
public class PostEquipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostEquipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    ConsultaEquip em = new ConsultaEquip();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		List<Equip> equip = new LinkedList<Equip>();
		
		PrintWriter writer = response.getWriter();
		
		for (Equip e: em.CreacionListadoEquip())
		{
			if (e.getName().equals(name))
			{
				//writer.write(e.getName()+"-"+e.getDescription()+"\n");
				equip.add(e);
			}
			
		}
		
		JSONArray array = new JSONArray(equip);
		JSONObject resultado = new JSONObject();
		if (equip.isEmpty())
		{
			resultado.put("code", "ERROR");
			resultado.put("mensaje", "Listado Vacío");
			resultado.put("resultado", array);
		} else
		{
			resultado.put("code", "ok");
			resultado.put("mensaje", "ok");
			resultado.put("resultado", array);
		}
		
		try
		{
			writer.write(resultado.toString());
		} finally
		{
			writer.close();
		}
		
	}

}
