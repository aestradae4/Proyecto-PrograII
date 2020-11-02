
package com.candysrouse.API;

import com.candysrouse.DAO.candyApiDetalleCompraDAO;
import com.candysrouse.Model.detalleCompraModel;
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
 * @author María de los Angeles Carranza
 */
//Mapeo URL DE API
@Path("/detalleCompra")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyDetalleCompraAPI {
    //Inicializar el objeto
    candyApiDetalleCompraDAO candyApiDetalleCompraDAO = new candyApiDetalleCompraDAO();

    //Variable de resultados
    boolean res;

    //Ingresar Registro 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregar(detalleCompraModel detallecompra) throws SQLException {
        res = candyApiDetalleCompraDAO.agregarDAO(detallecompra);
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
    public List<detalleCompraModel> obtenerRegistro() {
        List<detalleCompraModel> listaDetalleCompra = new ArrayList<detalleCompraModel>();
        listaDetalleCompra = candyApiDetalleCompraDAO.obtenerTodosDAO();
        return listaDetalleCompra;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idDetalleCompra}")
    public detalleCompraModel obtenerUnRegistro(@PathParam("idDetalleCompra") int idDetalleCompra) {
        detalleCompraModel detallecompra = new detalleCompraModel();
        detallecompra = candyApiDetalleCompraDAO.obtenerRegistroDAO(idDetalleCompra);
        if (detallecompra != null) {
            return detallecompra;
        } else {
            return detallecompra;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idDetalleCompra}")
    public Response eliminar(@PathParam("idDetalleCompra")int idDetalleCompra){ 
        res = candyApiDetalleCompraDAO.eliminarDAO(idDetalleCompra); 
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
   //@Path("/{idDetalleCompra}")
   public Response actualizar(detalleCompraModel detallecompraActualizado) throws SQLException{
       res = candyApiDetalleCompraDAO.actualizarDAO(detallecompraActualizado);
       if(res){ 
           return Response.ok(detallecompraActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el registro").build();
       }
   }
}
