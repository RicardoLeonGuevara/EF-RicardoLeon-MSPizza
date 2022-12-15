package com.idat.MSPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MSPizza.cliente.OpenFeignClient;
import com.idat.MSPizza.dto.ClienteDTO;
import com.idat.MSPizza.model.ClientePizzaFK;
import com.idat.MSPizza.model.Pizza;
import com.idat.MSPizza.model.PizzaDetalle;
import com.idat.MSPizza.repository.PizzaRepository;
import com.idat.MSPizza.repository.DetallePizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaRepository pizzaRepo;
	
	@Autowired
	private DetallePizzaRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardar(Pizza pizza) {
		pizzaRepo.save(pizza);
	}

	@Override
	public void asignarPizzaCliente() {
		List<ClienteDTO> listado = client.listarClientes();
		ClientePizzaFK fk = null;
		PizzaDetalle detalle = null;
		
		for (ClienteDTO clienteDTO : listado) {
			fk = new ClientePizzaFK();
			fk.setIdCliente(clienteDTO.getCodigo());
			fk.setIdPizza(1);
			
			detalle = new PizzaDetalle();
			detalle.setFk(fk);			
			detalleRepo.save(detalle);
	   }	
	}

}
