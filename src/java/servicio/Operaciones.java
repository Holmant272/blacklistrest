/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author uestudiantes
 */
@Path("generic")
public class Operaciones {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Operaciones
     */
    public Operaciones() {
    }

    @GET
    @Path("/lista")
    public List<String> listar(){
        List<String> items = new ArrayList<>();
        items.add("454589");
        items.add("636352");
        items.add("101252");
        items.add("140058");
        
        return items;
    }
    
    @GET
    @Path("/buscar/{id}")
    public String buscar(@PathParam("id") String id){
        String rta = "0";
        for (int i =0; i < listar().size(); i++){
            if (listar().get(i).equals(id)){
                return "1";
            }
        }
        
        return rta;
    }
    
}
