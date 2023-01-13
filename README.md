# INTRODUCCION
Microservicio que se encarga de la gestión de cuentas.

# FUNCIONAMIENTO
Para el pago o envio de dinero, se ejecuta el controlador TransactionController. Este se encarga de guardar las transacciones realizadas de la siguiente forma:
- Si se va a realizar un pago a otra cuenta, se debe indicar nuestra cuenta en la cuenta inicial que es donde sale el dinero a la cuenta final, que es donde llega el dinero.
- Si se va a recibir dinero, se debe indicar nuestra cuenta en la cuenta final y en la inicial la cuenta de donde vendrá el dinero.

Existe el CRUD de creación de cuentas.

# EJECUCIÓN
http://localhost:8080/login
{
	"name" : "",
	"password" : ""
}

Para obtener el token que llegará en el header y este se deberá agregar en cada llamado a la API.


# ARCHIVOS ADJUNTOS
Se agrega el archivo peigoSQL.sql, en donde se encuentra el modelo relacional

