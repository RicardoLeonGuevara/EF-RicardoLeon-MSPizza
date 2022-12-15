package com.idat.MSPizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
 
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class ClientePizzaFK implements Serializable{
	private static final long serialVersionUID = 3861808524595750242L;

	@Column(name = "id_pizza", nullable = false)
	private Integer idPizza;
	
	@Column(name = "id_cliente", nullable = false)
	private Integer idCliente;
}
