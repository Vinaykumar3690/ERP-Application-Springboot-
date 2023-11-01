package com.gitlab.adilcan.erp.service_product;

import com.gitlab.adilcan.erp.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created on January, 2018
 *
 * @author adilcan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tag extends BaseEntity {

	private String reference;

	@Lob
	private String description;

	private String color;

	@ManyToMany
	private List<Service> services;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public Tag(Long id, String reference, String description, String color, List<Service> services) {
		super(id);
		this.reference = reference;
		this.description = description;
		this.color = color;
		this.services = services;
	}

	

	public Tag() {
		// TODO Auto-generated constructor stub
	}

	

	//TODO add service collection and annotate as @ManyToMany
	
	
	
	

}
