package com.devops.dxc.devops.model;
import java.io.Serializable;

public class Uf implements Serializable{
    private Double valor;

    public Uf(){
        this.valor = Util.getUf();
    }

    public Double getValor() {
		return this.valor;
	}
}
