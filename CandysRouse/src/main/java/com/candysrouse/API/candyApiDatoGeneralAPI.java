
package com.candysrouse.API;
//Mapeo URL DE API

import com.candysrouse.DAO.candyApiDatosGeneralesDAO;
import com.candysrouse.Model.datoGeneralesModel;
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

@Path("/datosGenerales")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiDatoGeneralAPI {
    //Inicializar el objeto
    candyApiDatosGeneralesDAO datoGeneralDAO = new candyApiDatosGeneralesDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarDatoGeneral(datoGeneralesModel datoGeneral) throws SQLException {
        res = datoGeneralDAO.agregar(datoGeneral);
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
    public List<datoGeneralesModel> obtenerDatoGeneral() {
        List<datoGeneralesModel> listaDatosGenerales = new ArrayList<datoGeneralesModel>();
        listaDatosGenerales = datoGeneralDAO.obtenerTodos();
        return listaDatosGenerales;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idDatosGenerales}")
    public datoGeneralesModel obtenerUnEmpleado(@PathParam("idDatosGenerales") int idDatosGenerales) {
        datoGeneralesModel datoGeneral = new datoGeneralesModel();
        datoGeneral = datoGeneralDAO.obtenerUnDatoGeneral(idDatosGenerales);
        if (datoGeneral != null) {
            return datoGeneral;
        } else {
            return datoGeneral;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idDatosGenerales}")
    public Response eliminarDatoGeneral(@PathParam("idDatosGenerales")int idDatosGenerales){ 
        res = datoGeneralDAO.eliminar(idDatosGenerales); 
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
   public Response actualizarEmpleado(datoGeneralesModel datoActualizado) throws SQLException{
       res = datoGeneralDAO.actualizar(datoActualizado);
       if(res){ 
           return Response.ok(datoActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el usuario").build();
       }
   }
}
