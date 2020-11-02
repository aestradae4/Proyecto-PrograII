package com.candysrouse.API;
//Mapeo URL DE API

import com.candysrouse.DAO.candyApiMateriaPrimaDAO;
import com.candysrouse.Model.materiaPrimaModel;
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

@Path("/materiaPrima")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiMateriaPrimaAPI {
    //Inicializar el objeto
    candyApiMateriaPrimaDAO materiaPrimaDAO = new candyApiMateriaPrimaDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarMateriaPrima(materiaPrimaModel materiaPrima) throws SQLException {
        res = materiaPrimaDAO.agregar(materiaPrima);
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
    public List<materiaPrimaModel> obtenerDatoGeneral() {
        List<materiaPrimaModel> listaMateriaPrima = new ArrayList<materiaPrimaModel>();
        listaMateriaPrima = materiaPrimaDAO.obtenerTodos();
        return listaMateriaPrima;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idMateriaPrima}")
    public materiaPrimaModel obtenerUnaMateria(@PathParam("idMateriaPrima") int idMateriaPrima) {
        materiaPrimaModel materiaPrima = new materiaPrimaModel();
        materiaPrima = materiaPrimaDAO.obtenerUnaMateria(idMateriaPrima);
        if (materiaPrima != null) {
            return materiaPrima;
        } else {
            return materiaPrima;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idMateriaPrima}")
    public Response eliminarMateriaPrima(@PathParam("idMateriaPrima")int idMateriaPrima){ 
        res = materiaPrimaDAO.eliminar(idMateriaPrima); 
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
   //@Path("/{idMateriaPrima}")
   public Response actualizarMateria(materiaPrimaModel materiaActualizado) throws SQLException{
       res = materiaPrimaDAO.actualizar(materiaActualizado);
       if(res){ 
           return Response.ok(materiaActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el usuario").build();
       }
   }    
}
