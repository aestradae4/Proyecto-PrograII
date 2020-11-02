
package com.candysrouse.API;

import com.candysrouse.DAO.candyApiProductoDAO;
import com.candysrouse.Model.productoModel;
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
@Path("/producto")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiProductoAPI {
  //Inicializar el objeto
    candyApiProductoDAO candyApiProductoDAO = new candyApiProductoDAO();

    //Variable de resultados
    boolean res;

    //Ingresar Registro 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregar(productoModel producto) throws SQLException {
        res = candyApiProductoDAO.agregarDAO(producto);
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
    public List<productoModel> obtenerRegistro() {
        List<productoModel> listaProducto = new ArrayList<productoModel>();
        listaProducto = candyApiProductoDAO.obtenerTodosDAO();
        return listaProducto;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idProducto}")
    public productoModel obtenerUnRegistro(@PathParam("idProducto") int idProducto) {
        productoModel producto = new productoModel();
        producto = candyApiProductoDAO.obtenerRegistroDAO(idProducto);
        if (producto != null) {
            return producto;
        } else {
            return producto;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idProducto}")
    public Response eliminar(@PathParam("idProducto")int idProducto){ 
        res = candyApiProductoDAO.eliminarDAO(idProducto); 
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
   //@Path("/{idProducto}")
   public Response actualizar(productoModel productoActualizado) throws SQLException{
       res = candyApiProductoDAO.actualizarDAO(productoActualizado);
       if(res){ 
           return Response.ok(productoActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el registro").build();
       }
   }  
}
