package com.pace.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pace.library.dao.BookDAO;

/**
 * Servlet implementation class BookUpdateServlet
 */
public class BookUpdateServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
*/
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
BookDAO bookDao=new BookDAO();
boolean rows=false;
int id;
id=Integer.parseInt(request.getParameter("id"));
try {
rows=bookDao.updateBook(id);
}catch(Exception e) {
System.err.println("Book data could not updated");
}
}

}