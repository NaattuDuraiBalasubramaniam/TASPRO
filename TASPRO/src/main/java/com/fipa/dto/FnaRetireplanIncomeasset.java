package com.fipa.dto;

// Generated Jun 21, 2018 6:09:59 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * FnaRetireplanIncomeasset generated by hbm2java
 */
public class FnaRetireplanIncomeasset implements java.io.Serializable {

	private String iaId;
	private FnaSelfspouseDets fnaSelfspouseDets;
	private String retIaType;
	private String retIaClass;
	private String retIaDesc;
	private String retIaFrequency;
	private Double retIaAmout;
	private Double retIaEscrate;
	private Double retIaRoi;
	private String retIaAgebasedon;
	private String retIaAgestart;
	private String retIaAgeend;
	private String retIaCrtdBy;
	private Date retIaCrtdDate;
	private String retIaModBy;
	private Date retIaModDate;
	private String retReferenceId;
	

	public FnaRetireplanIncomeasset() {
	}

	public FnaRetireplanIncomeasset(String iaId) {
		this.iaId = iaId;
	}

	public FnaRetireplanIncomeasset(String iaId, FnaSelfspouseDets fnaSelfspouseDets, String retIaType,
			String retIaClass, String retIaDesc, String retIaFrequency, Double retIaAmout, Double retIaEscrate,
			Double retIaRoi, String retIaAgebasedon, String retIaAgestart, String retIaAgeend, String retIaCrtdBy,
			Date retIaCrtdDate, String retIaModBy, Date retIaModDate, String retReferenceId) {
		
		this.iaId = iaId;
		this.fnaSelfspouseDets = fnaSelfspouseDets;
		this.retIaType = retIaType;
		this.retIaClass = retIaClass;
		this.retIaDesc = retIaDesc;
		this.retIaFrequency = retIaFrequency;
		this.retIaAmout = retIaAmout;
		this.retIaEscrate = retIaEscrate;
		this.retIaRoi = retIaRoi;
		this.retIaAgebasedon = retIaAgebasedon;
		this.retIaAgestart = retIaAgestart;
		this.retIaAgeend = retIaAgeend;
		this.retIaCrtdBy = retIaCrtdBy;
		this.retIaCrtdDate = retIaCrtdDate;
		this.retIaModBy = retIaModBy;
		this.retIaModDate = retIaModDate;
		this.retReferenceId = retReferenceId;
	}

	public String getRetReferenceId() {
		return this.retReferenceId;
	}

	public void setRetReferenceId(String retReferenceId) {
		this.retReferenceId = retReferenceId;
	}

	public String getIaId() {
		return this.iaId;
	}

	public void setIaId(String iaId) {
		this.iaId = iaId;
	}

	public FnaSelfspouseDets getFnaSelfspouseDets() {
		return this.fnaSelfspouseDets;
	}

	public void setFnaSelfspouseDets(FnaSelfspouseDets fnaSelfspouseDets) {
		this.fnaSelfspouseDets = fnaSelfspouseDets;
	}

	public String getRetIaType() {
		return this.retIaType;
	}

	public void setRetIaType(String retIaType) {
		this.retIaType = retIaType;
	}

	public String getRetIaClass() {
		return this.retIaClass;
	}

	public void setRetIaClass(String retIaClass) {
		this.retIaClass = retIaClass;
	}

	public String getRetIaDesc() {
		return this.retIaDesc;
	}

	public void setRetIaDesc(String retIaDesc) {
		this.retIaDesc = retIaDesc;
	}

	public String getRetIaFrequency() {
		return this.retIaFrequency;
	}

	public void setRetIaFrequency(String retIaFrequency) {
		this.retIaFrequency = retIaFrequency;
	}

	public Double getRetIaAmout() {
		return this.retIaAmout;
	}

	public void setRetIaAmout(Double retIaAmout) {
		this.retIaAmout = retIaAmout;
	}

	public Double getRetIaEscrate() {
		return this.retIaEscrate;
	}

	public void setRetIaEscrate(Double retIaEscrate) {
		this.retIaEscrate = retIaEscrate;
	}

	public Double getRetIaRoi() {
		return this.retIaRoi;
	}

	public void setRetIaRoi(Double retIaRoi) {
		this.retIaRoi = retIaRoi;
	}

	public String getRetIaAgebasedon() {
		return this.retIaAgebasedon;
	}

	public void setRetIaAgebasedon(String retIaAgebasedon) {
		this.retIaAgebasedon = retIaAgebasedon;
	}

	public String getRetIaAgestart() {
		return this.retIaAgestart;
	}

	public void setRetIaAgestart(String retIaAgestart) {
		this.retIaAgestart = retIaAgestart;
	}

	public String getRetIaAgeend() {
		return this.retIaAgeend;
	}

	public void setRetIaAgeend(String retIaAgeend) {
		this.retIaAgeend = retIaAgeend;
	}

	public String getRetIaCrtdBy() {
		return this.retIaCrtdBy;
	}

	public void setRetIaCrtdBy(String retIaCrtdBy) {
		this.retIaCrtdBy = retIaCrtdBy;
	}

	public Date getRetIaCrtdDate() {
		return this.retIaCrtdDate;
	}

	public void setRetIaCrtdDate(Date retIaCrtdDate) {
		this.retIaCrtdDate = retIaCrtdDate;
	}

	public String getRetIaModBy() {
		return this.retIaModBy;
	}

	public void setRetIaModBy(String retIaModBy) {
		this.retIaModBy = retIaModBy;
	}

	public Date getRetIaModDate() {
		return this.retIaModDate;
	}

	public void setRetIaModDate(Date retIaModDate) {
		this.retIaModDate = retIaModDate;
	}

}
