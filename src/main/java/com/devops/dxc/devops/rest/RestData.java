package com.devops.dxc.devops.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.model.Impuesto;
import com.devops.dxc.devops.model.Saldo;
import com.devops.dxc.devops.model.Uf;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/msdxc")
public class RestData {
	
	private final static Logger LOGGER = Logger.getLogger("devops.subnivel.Control");
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/dxc", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Dxc getData(@RequestParam(name = "sueldo") String sueldo, @RequestParam(name = "ahorro") String ahorro){
		
		LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado Diez por ciento>");
		
        Dxc response = new Dxc(Integer.parseInt(ahorro), Integer.parseInt(sueldo));
		
		return response;
	}
	
	// Funcionalidad expuesta para test jMeter
	@GetMapping(path = "/impuesto", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Impuesto getDataImpuesto(@RequestParam(name = "sueldo") String sueldo, @RequestParam(name = "ahorro") String ahorro){
		
		LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Obteniendo Impuesto>");
		
        Impuesto response = new Impuesto(Integer.parseInt(ahorro), Integer.parseInt(sueldo));
		return response;
	}

	@GetMapping(path = "/saldo", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Saldo getDataSaldo(@RequestParam(name = "sueldo") String sueldo, @RequestParam(name = "ahorro") String ahorro){
		
		LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Obteniendo Saldo>");
		
        Saldo response = new Saldo(Integer.parseInt(ahorro), Integer.parseInt(sueldo));
		return response;
	}
	
	@GetMapping(path = "/uf", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Uf getDataUf(){
		
		LOGGER.log(Level.INFO, "< Trabajo DevOps - Calculo UF > <Obteniendo UF>");
		
        Uf response = new Uf();
		return response;
	}

	// fin funcionalidad expuesta para jMeter
}