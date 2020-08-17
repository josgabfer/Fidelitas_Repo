<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encargados de Area</title>
    </head>
    <body>
        <h1>Encargados de Area</h1>
        <ul>
            <c:forEach var="encargado" items="${encargados}">
                <li>${encargado.nombre_usuario} ${encargado.nombre} ${encargado.apellido_1}</li>
            </c:forEach>
                
        </ul>
    </body>
</html>
