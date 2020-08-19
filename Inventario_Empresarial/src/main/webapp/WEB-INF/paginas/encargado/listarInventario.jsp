<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="encargados">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4> Lista de Activos y Areas</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Descripcion de Activo</th>
                                <th>Netbios</th>
                                <th>Hostname</th>
                                <th>OS</th>
                                <th>Version</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos los elementos de la lista de clientes-->
                            <c:forEach var="activo" items="${activos}">
                                <tr>
                                    <td>${activo.id_activo}</td>
                                    <td>${activo.activo_des}</td>
                                    <td>${activo.netbios}</td>
                                    <td>${activo.hostname}</td>
                                    <td>${activo.os}</td>
                                    <td>${activo.os_version}</td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
                </div>
            </div>
        </div>
    </div>
</section>