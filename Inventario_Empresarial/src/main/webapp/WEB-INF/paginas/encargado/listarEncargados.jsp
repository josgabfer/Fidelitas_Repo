<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="encargados">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4> Lista de Encargados de Area</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre Usuario</th>
                                <th>Nombre Completo</th> 
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos los elementos de la lista de clientes-->
                            <c:forEach var="encargado" items="${encargados}">
                                <tr>
                                    <td>${encargado.id_encargado}</td>
                                    <td>${encargado.nombre_usuario}</td>
                                    <td>${encargado.nombre} ${encargado.apellido_1}</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&id_cliente=${encargado.id_encargado}"
                                           class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right"></i> Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>