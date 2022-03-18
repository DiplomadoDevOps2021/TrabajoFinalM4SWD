package com.devops.dxc.devops.model;
import java.io.Serializable;

public class Saldo implements Serializable{
    private int saldo;

    public Saldo(int ahorro, int sueldo){
        this.saldo = Util.getSaldo(ahorro, sueldo);
    }

    public int getSaldo() {
		return this.saldo;
	}
}
