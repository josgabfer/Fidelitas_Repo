<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="encargados">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4> Areas y Regiones </h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre Area</th>
                                <th>Nombre Plataforma</th>
                                <th>Nombre Region</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos los elementos de la lista de areas-->
                            <c:forEach var="area" items="${areas}">
                                <tr>
                                    <td>${area.id_area}</td>
                                    <td>${area.nombre_area}</td>
                                    <td>${area.nombre_plataforma}</td>
                                    <td>${area.nombre_region}</td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
                </div>
            </div>
        </div>
    </div>
</section>