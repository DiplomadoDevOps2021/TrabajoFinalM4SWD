package com.devops.dxc.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devops.dxc.devops.model.Util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Segemento para pruebas de métodos utilizados en la aplicación
//
@SpringBootTest
class DevopsApplicationTests {

    @Test
	@DisplayName("Test Método 10%")
	void testDxC(){
		assertEquals(4754104, Util.getDxc(55000000, 1500000));
		}


	@Test
	@DisplayName("Test Método Impuesto")
	void testImpuesto(){
		assertEquals(475364, Util.getImpuesto(55000000, 1500000));
		}
	
	@Test
	@DisplayName("Test Método Saldo")
	void testSaldo(){
		assertEquals(50245896, Util.getSaldo(55000000, 1500000));
	}

	@Test
	@DisplayName("Test Api UF")
	void testUf(){
		assertEquals(31694.03, Util.getUf());
	}
}