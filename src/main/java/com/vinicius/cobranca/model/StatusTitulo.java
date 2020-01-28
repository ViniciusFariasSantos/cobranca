package com.vinicius.cobranca.model;

public enum StatusTitulo {
		
	PEDENTE("Pedente"),
	RECEBIDO("Recebido");
	
	private String descricao;
	
	StatusTitulo(String descricao){
		
		this.descricao  = descricao;
		
	}
	public String getDescrição() {
		
		return descricao;
		
	}
	
	
}
