package com.devops.dxc.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devops.dxc.devops.model.Util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {


	@Test
	void testDxC(){
		assertEquals(4753645, Util.getDxc(55000000, 15000000));
		assertEquals(123, Util.getImpuesto(55000000, 15000000));
		assertEquals(456, Util.getSaldo(55000000, 15000000));
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
