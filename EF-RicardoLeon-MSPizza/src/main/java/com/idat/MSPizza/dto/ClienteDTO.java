package com.idat.MSPizza.dto;
 
import lombok.Data;

@Data
public class ClienteDTO {
	private Integer codigo;
	private String nombre;
	private String apellido;
	private String celular;
	private String direccion;
}
