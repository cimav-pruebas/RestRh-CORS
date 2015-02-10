package services;


import java.io.IOException;
import java.util.logging.Logger;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan.calderon
 */
@Provider
@PreMatching
public class RESTCorsResponseFilter implements ContainerResponseFilter {

    private final static Logger log = Logger.getLogger(RESTCorsResponseFilter.class.getName() ); 
    
   @Override
   public void filter(final ContainerRequestContext requestContext, final ContainerResponseContext cres) throws IOException {
       
        log.info( ">>>>>>>>>>> CERO <<<<<<<<<<<<<<< Executing REST response filter" );
       
        cres.getHeaders().add("Access-Control-Allow-Origin", "*");
        cres.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization, X-HTTP-Method-Override");
        cres.getHeaders().add("Access-Control-Allow-Credentials", "true");
        cres.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        cres.getHeaders().add("Access-Control-Max-Age", "1209600"); // 14 días
        
   }

}