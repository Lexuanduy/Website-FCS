package servelet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;

/**
 * Servlet implementation class signUp
 */
@WebServlet("/signUp")
public class signUp extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static {
		ObjectifyService.register(User.class);
	};
	static Logger log = Logger.getLogger(signUp.class.getName());

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public signUp() {
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
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/jsps/signUp.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*List<User> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if(br != null){
            json = br.readLine();
        }
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json, User.class);
        response.setContentType("application/json");*/
        /*ofy().save().entity(user).now(); */
		String id = request.getParameter("id");
		String fullname = request.getParameter("fullName");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String birthday = request.getParameter("birthDay");
		Date date = new Date();
        try {

            date = formatter.parse(birthday);

        } catch (ParseException e) {
            e.printStackTrace();
        }
		String email = request.getParameter("email");
		String password = request.getParameter("passWord");
		log.warning(password);
		String securitycode = request.getParameter("securityCode");
		String presentername = request.getParameter("presenterName");
		log.warning(presentername);
		String presenterlink = request.getParameter("presenterLink");
		log.warning(presenterlink);
		User user = new User(id, fullname, date, email, password, securitycode, presentername, presenterlink, System.currentTimeMillis(), System.currentTimeMillis());
		ofy().save().entity(user).now();
	}
}
