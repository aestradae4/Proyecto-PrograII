
package com.candysrouse.API;

import com.candysrouse.DAO.candyApiDetalleTipoRolDAO;
import com.candysrouse.Model.detalleTipoRolModel;
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
/**
 *
 * @author María de los Angeles Carranza Del Cid
 */
//Mapeo URL DE API
@Path("/detalleTipoRol")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiDetalleTipoRolAPI {
    //Inicializar el objeto
    candyApiDetalleTipoRolDAO candyApiDetalleTipoRolDAO = new candyApiDetalleTipoRolDAO();

    //Variable de resultados
    boolean res;

    //Ingresar Registro 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregar(detalleTipoRolModel detalletiporol) throws SQLException {
        res = candyApiDetalleTipoRolDAO.agregarDAO(detalletiporol);
        if (res) {
            return Response.status(Response.Status.CREATED).build();
        } else {
            return Response.status(500, "Ocurrio un error al ingresar el registro").build();
        }
    }

    /*
    Metodo Get: 
    Se utiliza para obtener la lista de objetos, segun la tabla en la base de datos
     */
    @GET
    public List<detalleTipoRolModel> obtenerRegistro() {
        List<detalleTipoRolModel> listaDetalleTipoRol = new ArrayList<detalleTipoRolModel>();
        listaDetalleTipoRol = candyApiDetalleTipoRolDAO.obtenerTodosDAO();
        return listaDetalleTipoRol;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idDetalleTipoRol}")
    public detalleTipoRolModel obtenerUnRegistro(@PathParam("idDetalleTipoRol") int idDetalleTipoRol) {
        detalleTipoRolModel detalletiporol = new detalleTipoRolModel();
        detalletiporol = candyApiDetalleTipoRolDAO.obtenerRegistroDAO(idDetalleTipoRol);
        if (detalletiporol != null) {
            return detalletiporol;
        } else {
            return detalletiporol;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idDetalleTipoRol}")
    public Response eliminar(@PathParam("idDetalleTipoRol")int idDetalleTipoRol){ 
        res = candyApiDetalleTipoRolDAO.eliminarDAO(idDetalleTipoRol); 
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
   //@Path("/{idDetalleTipoRol}")
   public Response actualizar(detalleTipoRolModel detalletiporolActualizado) throws SQLException{
       res = candyApiDetalleTipoRolDAO.actualizarDAO(detalletiporolActualizado);
       if(res){ 
           return Response.ok(detalletiporolActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el registro").build();
       }
   }
}
