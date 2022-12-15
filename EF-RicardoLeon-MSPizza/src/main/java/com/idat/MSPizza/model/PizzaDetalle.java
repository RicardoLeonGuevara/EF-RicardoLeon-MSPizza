package com.idat.MSPizza.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pizza")
public class PizzaDetalle {
	@Id
	private ClientePizzaFK fk = new ClientePizzaFK();
	
	public ClientePizzaFK getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFK fk) {
		this.fk = fk;
	}
}
