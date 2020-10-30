package com.candysrouse.API;


import com.candysrouse.DAO.candyApiTipoPersonaDAO;
import com.candysrouse.Model.tipoPersonaModel;
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

@Path("/tipoPersona")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiTipoPersonaAPI {
    //Inicializar el objeto
    candyApiTipoPersonaDAO TPDAO = new candyApiTipoPersonaDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarTipoPer(tipoPersonaModel pro) throws SQLException {
        res = TPDAO.agregar(pro);
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
    public List<tipoPersonaModel> obtenerTipoPer() {
        List<tipoPersonaModel> listaPro = new ArrayList<tipoPersonaModel>();
        listaPro = TPDAO.obtenerTodos();
        return listaPro;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idTipoPersona}")
    public tipoPersonaModel obtenerUnTipoPer(@PathParam("idTipoPersona") int idTipoPersona) {
        tipoPersonaModel tipoPersona = new tipoPersonaModel();
        tipoPersona = TPDAO.obtenerUnTipoPer(idTipoPersona);
        if (tipoPersona != null) {
            return tipoPersona;
        } else {
            return tipoPersona;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idTipoPersona}")
    public Response eliminarTipoPer(@PathParam("idTipoPersona")int idTipoPersona){ 
        res = TPDAO.eliminar(idTipoPersona); 
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
   public Response actualizarTipoPer(tipoPersonaModel tipoPersonaActualizado) throws SQLException{
       res = TPDAO.actualizar( tipoPersonaActualizado);
       if(res){ 
           return Response.ok( tipoPersonaActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el usuario").build();
       }
   }
}
