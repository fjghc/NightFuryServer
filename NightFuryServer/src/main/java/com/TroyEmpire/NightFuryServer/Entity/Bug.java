package com.TroyEmpire.NightFuryServer.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "Bug")
public class Bug implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	
	@Column(name = "reporterName")
	private String reporterName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "reportDate")
	private Date reportDate;
	
	
}
