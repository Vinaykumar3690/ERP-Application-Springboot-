package com.gitlab.adilcan.erp.commercial;

import com.gitlab.adilcan.erp.commercial.enumeration.Currency;

import com.gitlab.adilcan.erp.commercial.enumeration.PaymentTerms;
import com.gitlab.adilcan.erp.commercial.enumeration.PaymentTypes;
import com.gitlab.adilcan.erp.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Supplier extends ThirdParty {

    
	
	private String supplierReference;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date plannedDeliveryDate;

	public String getSupplierReference() {
		return supplierReference;
	}

	public void setSupplierReference(String supplierReference) {
		this.supplierReference = supplierReference;
	}

	public Date getPlannedDeliveryDate() {
		return plannedDeliveryDate;
	}

	public void setPlannedDeliveryDate(Date plannedDeliveryDate) {
		this.plannedDeliveryDate = plannedDeliveryDate;
	}

	public Supplier(Long id, String reference, PaymentTerms paymentTerms, PaymentTypes paymentTypes, String publicNote,
			String privateNote, Currency currency, List<Contract> contracts) {
		super(id, reference, paymentTerms, paymentTypes, publicNote, privateNote, currency, contracts);
		// TODO Auto-generated constructor stub
	}

	
    
}
