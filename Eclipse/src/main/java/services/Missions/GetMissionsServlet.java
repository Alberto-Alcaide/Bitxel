package services.Missions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Missions.Missions;
import manager.Missions.ConsultaMissions;

@WebServlet(urlPatterns = {
		"/GetMission"})

//initParams = {@WebInitParam(name = "marca", value = "")})

public class GetMissionsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//resp.setContentType("application/json");
		//resp.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/plain");
		PrintWriter writer = resp.getWriter();
		
		List<Missions> listaMissions = ConsultaMissions.CreacionListadoMissions();
		
		writer.append("Missions");
		
		for (Missions m : listaMissions) {
			writer.append(m.toString()+"\n");
		}
	}
}
