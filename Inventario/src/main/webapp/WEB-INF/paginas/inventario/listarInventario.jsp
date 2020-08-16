<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--Libreria para dar formato-->
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_CR"/>
<section id="Inventario">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Inventario</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Activo</th>
                                <th>Netbios</th>
                                <th>Hostname</th>
                                <th>OS</th>
                                <th>Version</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos los elementos de la lista de clientes-->
                            <c:forEach var="inventario" items="${activos}">
                                <tr>
                                    <td>${inventario.id_activo_detalles}</td>
                                    <td>${inventario.netbios}</td>
                                    <td>${inventario.hostname}</td>
                                    <td>${inventario.os}</td>
                                    <td>${inventario.os_version}</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&id_activo_detalles=${activo_Detalles.id_activo_detalles}" 
                                           class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right">
                                                Editar
                                            </i>
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
