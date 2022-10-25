package io.github.prem_sh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "ip_v4")
	String ipV4;
	
	@Column(name = "description")
	String Descripton;
	
	@Column(name = "is_active")
	Boolean isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIpV4() {
		return ipV4;
	}

	public void setIpV4(String ipV4) {
		this.ipV4 = ipV4;
	}

	public String getDescripton() {
		return Descripton;
	}

	public void setDescripton(String descripton) {
		Descripton = descripton;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
