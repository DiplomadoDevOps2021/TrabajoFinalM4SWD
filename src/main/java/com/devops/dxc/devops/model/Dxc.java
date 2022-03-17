package com.devops.dxc.devops.model;

import java.io.Serializable;

public class Dxc implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2988002029080131424L;
	
	private int dxc;
	private Double uf; 
	private int saldo;
	private int impuesto;
	private int sueldo;
	private int ahorro;

	public Dxc(int ahorro, int sueldo){
		this.ahorro = ahorro;
		this.sueldo = sueldo;
		this.uf = Util.getUf(); 
		this.dxc = Util.getDxc(ahorro,sueldo);
		this.impuesto = Util.getImpuesto(this.dxc, this.sueldo);
		this.saldo = this.ahorro - this.dxc; 
	}

	public Dxc() {
	}

	public int getDxc() {
		//return Util.getDxc(ahorro,sueldo);
		return this.dxc;
	}
	public void setDxc(int dxc) {
		this.dxc = dxc;
	}
	public int getSaldo() {
		// return (int) (this.ahorro - Util.getDxc(ahorro, sueldo));
		return this.saldo; 
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getImpuesto() {
		//return Util.getImpuesto(this.dxc, sueldo);
		return this.impuesto;
	}
	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getAhorro() {
		return ahorro;
	}

	public void setAhorro(int ahorro) {
		this.ahorro = ahorro;
	}
	public Double getUf() {
		return this.uf; 
		// return Util.getUf();
	}

	public void setUf(Double uf) {
		this.uf = uf;
	}

}
