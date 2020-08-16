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
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar": 
                /*    try {
                    this.editarCliente(request, response);
                } catch (ClassNotFoundException ex) {
                    ex.getMessage();
                }
*/
                break;

                case "eliminar":
                    /*
                try {
                    this.eliminarCliente(request, response);
                } catch (ClassNotFoundException ex) {
                    ex.getMessage();
                }
*/
                break;

                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }
        private void accionDefault(HttpServletRequest request, HttpServletResponse response) {
        List<activoDetalles> activos;
        try {
            activos = new InventarioDAOJDBC().listar();
            System.out.println("Activos = " + activos);
            HttpSession sesion = request.getSession();
            sesion.setAttribute("activos", activos);
            sesion.setAttribute("totalactivos", activos.size());
            response.sendRedirect("index.jsp");

//request.getRequestDispatcher("clientes.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    

}
