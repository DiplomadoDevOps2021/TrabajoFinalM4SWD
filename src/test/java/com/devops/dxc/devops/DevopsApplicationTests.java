package com.devops.dxc.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devops.dxc.devops.model.Util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< Updated upstream
@SpringBootTest
class DevopsApplicationTests {


	@Test
	void testDxC(){
		assertEquals(4754104, Util.getDxc(55000000, 15000000));
=======
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

// Segemento para pruebas de métodos utilizados en la aplicación
//
@SpringBootTest
class DevopsApplicationTests {

    @Test
	@DisplayName("Test Método 10%")
	void testDxC(){
		assertEquals(4753645, Util.getDxc(55000000, 1500000));
		}


	@Test
	@DisplayName("Test Método Impuesto")
	void testImpuesto(){
		assertEquals(475364, Util.getImpuesto(55000000, 1500000));
		}
	
	@Test
	@DisplayName("Test Método Saldo")
	void testSaldo(){
		assertEquals(50246355, Util.getSaldo(55000000, 1500000));
	}

	@Test
	@DisplayName("Test Api UF")
	void testUf(){
		assertEquals(31690.97, Util.getUf());
>>>>>>> Stashed changes
	}
}

// 	void ensureThatUserAPICallReturnStatusCode200() throws Exception {
//         HttpClient client = HttpClient.newBuilder().build();
//         HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:9000/rest/msdxc/dxc?ahorro=55000000&sueldo=1500000")).build();
//         HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
//         fail("FIXME");

//     }
	
// 	@Test
//     @DisplayName("Ensures that the content type starts with application/json")
//     void ensureThatJsonIsReturnedAsContentType() throws Exception {
//         HttpClient client = HttpClient.newBuilder().build();
//         HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com/users/vogella")).build();
//         HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
//         fail("FIXME");
//         // HINT Use response.headers()

//     }
// }
