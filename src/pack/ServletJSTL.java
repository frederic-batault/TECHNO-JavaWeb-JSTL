package pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ServletJSTL
 */
@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletJSTL() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String nom = request.getParameter("champNom");
		String prenom = request.getParameter("champPrenom");
		String mail = request.getParameter("champMail");
		String login = request.getParameter("champLogin");
		String mdp = request.getParameter("champMdp");

		Utilisateur u = new Utilisateur(nom,prenom,mail,login,mdp);
		HttpSession masession = request.getSession();
		masession.setAttribute("utilisateur", u);
		
		masession.setAttribute("nom", u.getNom());
		masession.setAttribute("prenom", u.getPrenom());
		masession.setAttribute("mail", u.getEmail());
		masession.setAttribute("login", u.getLogin());
		masession.setAttribute("mdp", u.getMdp());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("affichage.jsp");
		dispatcher.forward(request, response);



	}
}
