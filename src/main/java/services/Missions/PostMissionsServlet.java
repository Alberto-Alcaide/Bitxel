package services.Missions;

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
import dao.Missions.ConsultaMissions;
import dao.Missions.Missions;
import manager.Equip.ConsultaEquip;

/**
 * Servlet implementation class PostEquipServlet
 */
@WebServlet("/PostEquip")
public class PostMissionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostMissionsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//resp.setContentType("application/json");
		//resp.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/plain");
		PrintWriter writer = resp.getWriter();
		
		List<Equip> listaEquipamiento = ConsultaEquip.CreacionListadoEquip();
		
		writer.append("Hola");
		
		for (Equip i : listaEquipamiento) {
			writer.append(i.toString()+"\n");
		}
	}
	*/
    
    ConsultaMissions cm = new ConsultaMissions();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		List<Missions> mission = new LinkedList<Missions>();
		
		PrintWriter writer = response.getWriter();
		
		for (Missions m: cm.CreacionListadoMissions())
		{
			if (m.getName().equals(name))
			{
				//writer.write(e.getName()+"-"+e.getDescription()+"\n");
				mission.add(m);
			}
			
		}
		
		JSONArray array = new JSONArray(mission);
		JSONObject resultado = new JSONObject();
		if (mission.isEmpty())
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
