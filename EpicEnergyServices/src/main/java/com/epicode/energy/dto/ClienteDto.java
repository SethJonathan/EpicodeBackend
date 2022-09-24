package com.epicode.energy.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import com.epicode.energy.models.TipoCliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
	
	private String ragioneScociale;
	private String partitaIva;
	private String email;
	

	private Date dataInserimento;
	

	private Date dataUltimoContatto;
	private int FatturatoAnnuale;
	private String pec;
	private String telefono;
	

	private String nomeContatto;
	

	private String cognomeContatto;
	private String telefonoContatto;
	
	
	@Enumerated(EnumType.STRING)
	private TipoCliente tipoCliente;
	


}
