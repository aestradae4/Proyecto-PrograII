package com.candysrouse.API;
//Mapeo URL DE API

import com.candysrouse.DAO.candyApiTipoRolDAO;
import com.candysrouse.Model.tipoRolModel;
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

@Path("/tipoRol")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiTipoRolAPI {

    //Inicializar el objeto
    candyApiTipoRolDAO tipoRolDAO = new candyApiTipoRolDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarTipoRol(tipoRolModel tipoRol) throws SQLException {
        res = tipoRolDAO.agregar(tipoRol);
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
    public List<tipoRolModel> obtenerTipoRol() {
        List<tipoRolModel> listaTipoRol = new ArrayList<tipoRolModel>();
        listaTipoRol = tipoRolDAO.obtenerTodos();
        return listaTipoRol;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idTipoRol}")
    public tipoRolModel obtenerTipoRol(@PathParam("idTipoRol") int idTipoRol) {
        tipoRolModel tipoRol = new tipoRolModel();
        tipoRol = tipoRolDAO.obtenerUnTipoRol(idTipoRol);
        if (tipoRol != null) {
            return tipoRol;
        } else {
            return tipoRol;
        }

    }

    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
     */
    @DELETE
    @Path("/{idTipoRol}")
    public Response eliminarTipoRol(@PathParam("idTipoRol") int idTipoRol) {
        res = tipoRolDAO.eliminar(idTipoRol);
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
    public Response actualizarTipoRol(tipoRolModel tipoRolActualizado) throws SQLException {
        res = tipoRolDAO.actualizar(tipoRolActualizado);
        if (res) {
            return Response.ok(tipoRolActualizado).build();
        } else {
            return Response.status(500, "Error al actualizar el usuario").build();
        }
    }
}
