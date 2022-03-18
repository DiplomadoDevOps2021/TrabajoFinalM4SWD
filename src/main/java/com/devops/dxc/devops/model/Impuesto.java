package com.devops.dxc.devops.model;
import java.io.Serializable;

public class Impuesto implements Serializable{
    private int impuesto;

    public Impuesto(int ahorro, int sueldo){
        this.impuesto = Util.getImpuesto(ahorro, sueldo);
    }

    public int getImpuesto() {
		return this.impuesto;
	}
}
