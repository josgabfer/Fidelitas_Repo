package web;

import datos.InventarioDAOJDBC;
import dominio.activoDetalles;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<activoDetalles> activos;
        try {
            activos = new InventarioDAOJDBC().listar();
            System.out.println("activos = " + activos);
            request.setAttribute("activos", activos);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        } catch (ServletException ex) {
            ex.getMessage();
        }
        

    }
    

}
