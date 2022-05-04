package com.redhat.training;
import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;

import javax.ws.rs.WebApplicationException;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.exception.ResteasyWebApplicationException;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;

public class MultiplierResourceTest {
    
    SolverService solverService;
    MultiplierResource multiplierResource;

    @BeforeEach
    public void setup() {
        solverService = mock(SolverService.class);
        multiplierResource = new MultiplierResource(solverService);
     }
    public void simpleMultiplication() {

	     // Given
	    
	     Mockito.when(solverService.solve("2")).thenReturn(Float.valueOf("2"));
	     Mockito.when(solverService.solve("3")).thenReturn(Float.valueOf("3"));
	            // When
	            Float result = multiplierResource.multiply("2", "3");
	            // Then
	              assertEquals( 6.0f, result );
	          }
	    
}
