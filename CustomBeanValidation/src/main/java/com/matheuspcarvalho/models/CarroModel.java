package com.matheuspcarvalho.models;

import com.matheuspcarvalho.anotations.PlacaCarro;

public class CarroModel {

	@PlacaCarro
	private String placa;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
