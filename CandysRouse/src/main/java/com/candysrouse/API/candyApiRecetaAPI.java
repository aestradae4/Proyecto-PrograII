package com.candysrouse.API;
//Mapeo URL DE API

import com.candysrouse.DAO.candyApiRecetaDAO;
import com.candysrouse.Model.recetaModel;
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

@Path("/receta")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiRecetaAPI {
    //Inicializar el objeto
    candyApiRecetaDAO recetaDAO = new candyApiRecetaDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarReceta(recetaModel receta) throws SQLException {
        res = recetaDAO.agregar(receta);
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
    public List<recetaModel> obtenerReceta() {
        List<recetaModel> listaReceta = new ArrayList<recetaModel>();
        listaReceta = recetaDAO.obtenerTodos();
        return listaReceta;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idReceta}")
    public recetaModel obtenerReceta(@PathParam("idReceta") int idReceta) {
        recetaModel receta = new recetaModel();
        receta = recetaDAO.obtenerUnaReceta(idReceta);
        if (receta != null) {
            return receta;
        } else {
            return receta;
        }

    }

    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
     */
    @DELETE
    @Path("/{idReceta}")
    public Response eliminarReceta(@PathParam("idReceta") int idReceta) {
        res = recetaDAO.eliminar(idReceta);
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
    public Response actualizarReceta(recetaModel recetaActualizado) throws SQLException {
        res = recetaDAO.actualizar(recetaActualizado);
        if (res) {
            return Response.ok(recetaActualizado).build();
        } else {
            return Response.status(500, "Error al actualizar el usuario").build();
        }
    }
    
}
