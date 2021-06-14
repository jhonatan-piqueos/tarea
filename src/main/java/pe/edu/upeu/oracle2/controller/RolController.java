package pe.edu.upeu.oracle2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.upeu.oracle2.dao.RoDao;
import pe.edu.upeu.oracle2.daoImpl.RolDaoImpl;
import pe.edu.upeu.oracle2.entity.Rol;

/**
 * Servlet implementation class RolController
 */
public class RolController extends HttpServlet {
	private Gson gson = new Gson();
	private RoDao rdo = new RolDaoImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RolController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		String nrol = request.getParameter("nomrol");
		switch (op) {
		case 1:out.println(gson.toJson(rdo.create(new Rol(nrol,1))));				
			break;
		case 2:
			int id1 = Integer.parseInt(request.getParameter("id"));
			int est = Integer.parseInt(request.getParameter("estado"));
			Rol r = new Rol();
			r.setIdrol(id1);
			r.setNomrol(nrol);
			r.setEstado(est);				
			gson.toJson(rdo.update(r));
			break;
		case 3:
			int id2 = Integer.parseInt(request.getParameter("id"));
			gson.toJson(rdo.read(id2));
			break;
		case 4:
			int id3 = Integer.parseInt(request.getParameter("id"));
			gson.toJson(rdo.delete(id3));
			break;
		case 5:
			gson.toJson(rdo.readAll());
			break;	

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
