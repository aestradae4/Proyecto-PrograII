package com.candysrouse.API;

//Mapeo URL DE API
import com.candysrouse.DAO.candyApiProveedorDAO;
import com.candysrouse.Model.proveedorModel;
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

@Path("/proveedor")
//Se va a consumir consultas JSON
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class candyApiProveedorAPI {
    
    //Inicializar el objeto
    candyApiProveedorDAO proDAO = new candyApiProveedorDAO();

    //Variable de resultados
    boolean res;

    //Ingresar usuario 
    /*
    Post: Sirve para enviar la informacion 
     */
    @POST
    public Response agregarProveedor(proveedorModel pro) throws SQLException {
        res = proDAO.agregar(pro);
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
    public List<proveedorModel> obtenerProveedor() {
        List<proveedorModel> listaPro = new ArrayList<proveedorModel>();
        listaPro = proDAO.obtenerTodos();
        return listaPro;
    }

    /*
    @GET by ID: 
    Se utiliza para obtener un objeto especifico segun una tabla de la base de datos
     */
    @GET
    @Path("/{idProveedor}")
    public proveedorModel obtenerUnProveedor(@PathParam("idProveedor") int idProveedor) {
        proveedorModel pro = new proveedorModel();
        pro = proDAO.obtenerUnPro(idProveedor);
        if (pro != null) {
            return pro;
        } else {
            return pro;
        }

    }
    
    /*
    Metodo DELETE 
    Encargado de eliminar un registro en especifico de la base de datos
    */
    @DELETE
    @Path("/{idProveedor}")
    public Response eliminarProveedor(@PathParam("idProveedor")int idProveedor){ 
        res = proDAO.eliminar(idProveedor); 
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
   public Response actualizarProveedor(proveedorModel proveedorActualizado) throws SQLException{
       res = proDAO.actualizar(proveedorActualizado);
       if(res){ 
           return Response.ok(proveedorActualizado).build(); 
       }else {
           return Response.status(500, "Error al actualizar el usuario").build();
       }
   }
}
