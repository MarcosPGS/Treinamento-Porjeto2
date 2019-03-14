package com.stefanini.treinamento.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stefanini.treinamento.entity.Cachorro;

/**
 * Servlet implementation class CachorroServlet
 */
@WebServlet("/CachorroServlet")
public class CachorroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CachorroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Cachorro> cachorros = new ArrayList<>();
		cachorros.add(new Cachorro("Pingo", 1));
		cachorros.add(new Cachorro("Shrek", 2));
		cachorros.add(new Cachorro("Apolo", 3));
		
		response.getWriter().append(cachorros.toString()).append("Served at: ").append(request.getContextPath());
		System.out.println("execultado com exit..");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
