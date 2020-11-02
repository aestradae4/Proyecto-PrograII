package com.candysrouse.API;
//Mapeo URL DE API

import com.candysrouse.DAO.candyApiFormaPagoDAO;
import com.candysrouse.Model.formaPagoModel;
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

@Path("/formaPago")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiFormaPagoApi {

    //Inicializar el objeto
    candyApiFormaPagoDAO formaPagoDAO = new candyApiFormaPagoDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarFormaPago(formaPagoModel formaPago) throws SQLException {
        res = formaPagoDAO.agregar(formaPago);
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
    public List<formaPagoModel> obtenerFormaPago() {
        List<formaPagoModel> listaFormaPago = new ArrayList<formaPagoModel>();
        listaFormaPago = formaPagoDAO.obtenerTodos();
        return listaFormaPago;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idFormaPago}")
    public formaPagoModel obtenerUnaFormaPago(@PathParam("idFormaPago") int idFormaPago) {
        formaPagoModel formaPago = new formaPagoModel();
        formaPago = formaPagoDAO.obtenerUnaFormaPago(idFormaPago);
        if (formaPago != null) {
            return formaPago;
        } else {
            return formaPago;
        }

    }

    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
     */
    @DELETE
    @Path("/{idFormaPago}")
    public Response eliminarFormaPago(@PathParam("idFormaPago") int idFormaPago) {
        res = formaPagoDAO.eliminar(idFormaPago);
        if (res) {
            return Response.status(200, "Registro eliminado correctamente").build();
        } else {
            return Response.status(500, "Ocurrio un error al eliminar el registro").build();
        }
    }

    /*
    Metodo PUT:
    Encargado de actualizar datos en un registro en especifico en la DB
     */
    @PUT
   
    public Response actualizarEmpleado(formaPagoModel formaPagoActualizado) throws SQLException {
        res = formaPagoDAO.actualizar(formaPagoActualizado);
        if (res) {
            return Response.ok(formaPagoActualizado).build();
        } else {
            return Response.status(500, "Error al actualizar el usuario").build();
        }
    }

}
