package services.Stats;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Stats.Stats;
import manager.Stats.ConsultaStats;

@WebServlet(urlPatterns = {
		"/GetStats"})

//initParams = {@WebInitParam(name = "marca", value = "")})

public class GetStatsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//resp.setContentType("application/json");
		//resp.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/plain");
		PrintWriter writer = resp.getWriter();
		
		List<Stats> listaStats = ConsultaStats.CreacionListadoStats();
		
		writer.append("Stats");
		
		for (Stats s : listaStats) {
			writer.append(s.toString()+"\n");
		}
	}
}
