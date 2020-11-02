
package com.candysrouse.API;

import com.candysrouse.DAO.candyApiEmpresaDAO;
import com.candysrouse.Model.empresaModel;
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
 * @author Maria de los Angeles Carranza Del Cid
 */
@Path("/empresa")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiEmpresaAPI {

     //Inicializar el objeto
    candyApiEmpresaDAO empresaDAO = new candyApiEmpresaDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarEmpresa(empresaModel empresa) throws SQLException {
        res = empresaDAO.agregar(empresa);
        if (res) {
            return Response.status(Response.Status.CREATED).build();
        } else {
            return Response.status(500, "Ocurrio un error al registrar la emapresa").build();
        }
    }

    /*
    Metodo Get: 
    Se utiliza para obtener la lista de objetos, segun la tabla en la base de datos
     */
    @GET
    public List<empresaModel> obtenerEmpresa() {
        List<empresaModel> listaEmpresa = new ArrayList<empresaModel>();
        listaEmpresa = empresaDAO.obtenerTodos();
        return listaEmpresa;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idEmpresa}")
    public empresaModel obtenerEmpresa(@PathParam("idEmpresa") int idEmpresa) {
        empresaModel empresa = new empresaModel();
        empresa = empresaDAO.obtenerUnaEmpresa(idEmpresa);
        if (empresa != null) {
            return empresa;
        } else {
            return empresa;
        }

    }

    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
     */
    @DELETE
    @Path("/{idEmpresa}")
    public Response eliminarEmpresa(@PathParam("idEmpresa") int idEmpresa) {
        res = empresaDAO.eliminar(idEmpresa);
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
    public Response actualizarEmpresa (empresaModel empresaActualizado) throws SQLException {
        res = empresaDAO.actualizar(empresaActualizado);
        if (res) {
            return Response.ok(empresaActualizado).build();
        } else {
            return Response.status(500, "Error al actualizar el registro").build();
        }
    }
}
