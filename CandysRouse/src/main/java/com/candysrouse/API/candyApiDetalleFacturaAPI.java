
package com.candysrouse.API;

import com.candysrouse.DAO.candyApiDetalleFacturaDAO;
import com.candysrouse.Model.detalleFacturaModel;
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
@Path("/detalleFactura")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiDetalleFacturaAPI {
    //Inicializar el objeto
    candyApiDetalleFacturaDAO candyApiDetalleFacturaDAO = new candyApiDetalleFacturaDAO();

    //Variable de resultados
    boolean res;

    //Ingresar Registro 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregar(detalleFacturaModel detallefactura) throws SQLException {
        res = candyApiDetalleFacturaDAO.agregarDAO(detallefactura);
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
    public List<detalleFacturaModel> obtenerRegistro() {
        List<detalleFacturaModel> listaDetalleFactura = new ArrayList<detalleFacturaModel>();
        listaDetalleFactura = candyApiDetalleFacturaDAO.obtenerTodosDAO();
        return listaDetalleFactura;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idDetalleFactura}")
    public detalleFacturaModel obtenerUnRegistro(@PathParam("idDetalleFactura") int idDetalleFactura) {
        detalleFacturaModel detallefactura = new detalleFacturaModel();
        detallefactura = candyApiDetalleFacturaDAO.obtenerRegistroDAO(idDetalleFactura);
        if (detallefactura != null) {
            return detallefactura;
        } else {
            return detallefactura;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idDetalleFactura}")
    public Response eliminar(@PathParam("idDetalleFactura")int idDetalleFactura){ 
        res = candyApiDetalleFacturaDAO.eliminarDAO(idDetalleFactura); 
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
   //@Path("/{idDetalleFactura}")
   public Response actualizar(detalleFacturaModel detallefacturaActualizado) throws SQLException{
       res = candyApiDetalleFacturaDAO.actualizarDAO(detallefacturaActualizado);
       if(res){ 
           return Response.ok(detallefacturaActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el registro").build();
       }
   }
}
