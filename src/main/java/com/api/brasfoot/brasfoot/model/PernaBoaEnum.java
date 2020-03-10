package com.api.brasfoot.brasfoot.model;


public enum PernaBoaEnum {
	D("Direita"), E("Esquerda");
	
	private String descricao;
	
	private PernaBoaEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static PernaBoaEnum find(String value) {
		for(PernaBoaEnum status : PernaBoaEnum.values()) {
			if(status.name().equalsIgnoreCase(value))
				return status;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
