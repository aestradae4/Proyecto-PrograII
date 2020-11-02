
package com.candysrouse.API;

import com.candysrouse.DAO.candyApiComprasDAO;
import com.candysrouse.Model.comprasModel;
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
@Path("/compras")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiComprasAPI {
   //Inicializar el objeto
    candyApiComprasDAO candyApiComprasDAO = new candyApiComprasDAO();

    //Variable de resultados
    boolean res;

    //Ingresar Registro 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregar(comprasModel compras) throws SQLException {
        res = candyApiComprasDAO.agregarDAO(compras);
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
    public List<comprasModel> obtenerRegistro() {
        List<comprasModel> listaCompra = new ArrayList<comprasModel>();
        listaCompra = candyApiComprasDAO.obtenerTodosDAO();
        return listaCompra;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idCompra}")
    public comprasModel obtenerUnRegistro(@PathParam("idCompra") int idCompra) {
        comprasModel compras = new comprasModel();
        compras = candyApiComprasDAO.obtenerRegistroDAO(idCompra);
        if (compras != null) {
            return compras;
        } else {
            return compras;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idCompra}")
    public Response eliminar(@PathParam("idCompra")int idCompra){ 
        res = candyApiComprasDAO.eliminarDAO(idCompra); 
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
   //@Path("/{idCompra}")
   public Response actualizar(comprasModel comprasActualizado) throws SQLException{
       res = candyApiComprasDAO.actualizarDAO(comprasActualizado);
       if(res){ 
           return Response.ok(comprasActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el registro").build();
       }
   }
}
