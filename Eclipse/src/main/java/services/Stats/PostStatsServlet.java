package services.Stats;

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
import dao.Stats.Stats;
import manager.Equip.ConsultaEquip;
import manager.Stats.ConsultaStats;

/**
 * Servlet implementation class PostEquipServlet
 */
@WebServlet("/PostStats")

public class PostStatsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostStatsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    ConsultaStats cs = new ConsultaStats();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String level = request.getParameter("level");
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		List<Stats> stat = new LinkedList<Stats>();
		
		PrintWriter writer = response.getWriter();
		
		for (Stats s: cs.CreacionListadoStats())
		{
			if (s.getLevel().equals(level))
			{
				//writer.write(e.getName()+"-"+e.getDescription()+"\n");
				stat.add(s);
			}
			
		}
		
		JSONArray array = new JSONArray(stat);
		JSONObject resultado = new JSONObject();
		if (stat.isEmpty())
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
