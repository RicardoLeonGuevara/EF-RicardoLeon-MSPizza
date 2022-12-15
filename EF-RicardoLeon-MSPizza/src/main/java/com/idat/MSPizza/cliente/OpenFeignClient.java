package com.idat.MSPizza.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MSPizza.dto.ClienteDTO;

@FeignClient(name = "cliente-microservicio", url="localhost:8091" )
public interface OpenFeignClient {
	@GetMapping("/api/cliente/v1/listar")
	public List<ClienteDTO> listarClientes();
}
