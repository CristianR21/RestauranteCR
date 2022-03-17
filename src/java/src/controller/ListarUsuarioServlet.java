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
import java.util.List;
import src.entity.Usuario;
import src.service.IUsuarioService;
import src.service.UsuarioServiceImpl;

@WebServlet(name = "ListarUsuarioServlet", urlPatterns = {"/ListarUsuarioServlet"})
public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("tex/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>servlet</h1>");
        out.println("<!DOCTYPE html>");
        out.println("<html");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table borde='2'");
        out.println("<tr>");
        out.println("<th>id</th>");
        out.println("<th>nombre</th>");
        out.println("<th>contraseña</th>");
        out.println("<th>sexo</th>");
        out.println("<th>edad</th>");
        out.println("<th>carrera</th>");
        out.println("<th>grado</th>");
        out.println("<th>grupo</th>");
        out.println("</tr>");
        IUsuarioService service=new UsuarioServiceImpl();
        List<Usuario> listaUsuario= service.obtenerRegistros();
        for (Usuario usuario:listaUsuario) {
          out.println("<tr>");
          out.println("<td>"+usuario.getCodigo()+"</td");
           out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html");

    }
}
