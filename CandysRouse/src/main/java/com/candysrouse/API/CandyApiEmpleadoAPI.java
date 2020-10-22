package com.candysrouse.API;

import com.candysrouse.DAO.candyApiUsuariosDAO;
import com.candysrouse.Model.empleadoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Mapeo URL DE API
@Path("/empleados")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandyApiEmpleadoAPI {

    //Inicializar el objeto
    candyApiUsuariosDAO empleadoDAO = new candyApiUsuariosDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarEmpleado(empleadoModel empleado) throws SQLException {
        res = empleadoDAO.agregar(empleado);
        if (res) {
            return Response.status(Response.Status.CREATED).build();
        } else {
            return Response.status(500, "Ocurrio un error al registrar el usuario").build();
        }
    }

    /*
    Metodo Get: 
    Se utiliza para obtener la lista de objetos, segun la tabla en la base de datos
     */
    @GET
    public List<empleadoModel> obtenerEmpleado() {
        List<empleadoModel> listaEmpleado = new ArrayList<empleadoModel>();
        listaEmpleado = empleadoDAO.obtenerTodos();
        return listaEmpleado;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idEmpleado}")
    public empleadoModel obtenerUnEmpleado(@PathParam("idEmpleado") int idEmpleado) {
        empleadoModel empleado = new empleadoModel();
        empleado = empleadoDAO.obtenerUnEmpleado(idEmpleado);
        if (empleado != null) {
            return empleado;
        } else {
            return empleado;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idEmpleado}")
    public Response eliminarEmpleado(@PathParam("idEmpleado")int idEmpleado){ 
        res = empleadoDAO.eliminar(idEmpleado); 
        if(res){ 
            return Response.status(200, "Registro eliminado correctamente").build();
        }else { 
            return Response.status(500, "Ocurrio un error al eliminar el registro").build(); 
        }
    }
    /*
    Metodo PUT:
    Encargado de actualizar datos en un registro en especifico en la DB
    */
   @PUT
   //@Path("/{idEmpleado}")
   public Response actualizarEmpleado(empleadoModel empleadoActualizado) throws SQLException{
       res = empleadoDAO.actualizar(empleadoActualizado);
       if(res){ 
           return Response.ok(empleadoActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el usuario").build();
       }
   }
}
