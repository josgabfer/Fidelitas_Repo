package web;

import Datos.EncargadoDaoJDBC;
import Dominio.Encargado;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Encargado> encargados = new EncargadoDaoJDBC().listar();
        System.out.println("Encargados =" + encargados);
        request.setAttribute("encargados", encargados);
        request.getRequestDispatcher("encargados.jsp").forward(request, response);
    }
    
}
