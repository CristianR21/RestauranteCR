/*
cristian Adair Ramirez Rodriguez
Fecha de creación:16/03/2022, 10:43:34 AM
Fecha de actualización:17/03/2022 09:00 AM
Descripción: servlet
 */
package src.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListarUsuarioServlet", urlPatterns = {"/ListarUsuarioServlet"})
public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("tex/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>servlet</h1>");
    }
}
