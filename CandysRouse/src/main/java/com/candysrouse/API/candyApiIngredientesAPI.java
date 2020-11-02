package com.candysrouse.API;
//Mapeo URL DE API

import com.candysrouse.DAO.candyApiIngredientesDAO;
import com.candysrouse.Model.ingredientesModel;
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

@Path("/ingredientes")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiIngredientesAPI {
    //Inicializar el objeto
    candyApiIngredientesDAO ingredienteDAO = new candyApiIngredientesDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarIngredientes(ingredientesModel ingredientes) throws SQLException {
        res = ingredienteDAO.agregar(ingredientes);
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
    public List<ingredientesModel> obtenerDatoGeneral() {
        List<ingredientesModel> listaIngredientes = new ArrayList<ingredientesModel>();
        listaIngredientes = ingredienteDAO.obtenerTodos();
        return listaIngredientes;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idIngredientes}")
    public ingredientesModel obtenerUnIngredientes(@PathParam("idIngredientes") int idIngredientes) {
        ingredientesModel ingredientes = new ingredientesModel();
        ingredientes = ingredienteDAO.obtenerUnIngredientes(idIngredientes);
        if (ingredientes != null) {
            return ingredientes;
        } else {
            return ingredientes;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idIngredientes}")
    public Response eliminarIngrediente(@PathParam("idIngredientes")int idIngredientes){ 
        res = ingredienteDAO.eliminar(idIngredientes); 
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
   //@Path("/{idReceta}")
   public Response actualizarIngrediente(ingredientesModel ingredienteActualizado) throws SQLException{
       res = ingredienteDAO.actualizar(ingredienteActualizado);
       if(res){ 
           return Response.ok(ingredienteActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el usuario").build();
       }
   }
}
