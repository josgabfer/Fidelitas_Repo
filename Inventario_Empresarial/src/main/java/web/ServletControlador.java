package web;

import Datos.EncargadoDaoJDBC;
import Dominio.Area_TI;
import Dominio.Encargado;
import Dominio.Inventario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.accionDefault(request, response);
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Encargado> encargados = new EncargadoDaoJDBC().listar();
        System.out.println("encargados =" + encargados);
        request.setAttribute("encargados", encargados);
        request.getRequestDispatcher("encargados.jsp").forward(request, response);

//        List<Area_TI> areas = new EncargadoDaoJDBC().listar_area_it();
//        System.out.println("areas =" + areas);
//        request.setAttribute("areas", areas);
//        request.getRequestDispatcher("encargados.jsp").forward(request, response);
//        
//                List<Inventario> activos = new EncargadoDaoJDBC().listar_activos();
//        System.out.println("activos =" + activos);
//        request.setAttribute("activos", activos);
//        request.getRequestDispatcher("encargados.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "inventario":
                    this.listarInventario(request, response);
                    break;
                case "areas_regiones":
                    this.listarAreas_Regiones(request, response);
                case "encargados":
                    this.accionDefault(request, response);
                default:
                    this.accionDefault(request, response);
            }

        } else {
            this.accionDefault(request, response);
        }
    }

    private void listarInventario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Inventario> activos = new EncargadoDaoJDBC().listar_activos();
        System.out.println("activos =" + activos);
        request.setAttribute("activos", activos);
        request.getRequestDispatcher("encargados.jsp").forward(request, response);
    }
        private void listarAreas_Regiones(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Area_TI> areas = new EncargadoDaoJDBC().listar_area_it();
        System.out.println("areas =" + areas);
        request.setAttribute("areas", areas);
        request.getRequestDispatcher("encargados.jsp").forward(request, response);
    }

}
