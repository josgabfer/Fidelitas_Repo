<section id="actions" class="py-4 mb-4 bg-light">
    <div class="dropdown">
        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Listas
        </button>
        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
            <a class="dropdown-item" action="${pageContext.request.contextPath}/ServletControlador?accion=areas_regiones">Enlistar Areas y Regiones</a>
            <a class="dropdown-item" action="${pageContext.request.contextPath}/ServletControlador?accion=encargados">Enlistar Encargados</a>
            <a class="dropdown-item" action="${pageContext.request.contextPath}/ServletControlador?accion=inventario">Enlistar Inventario</a>
        </div>
    </div>
</section>