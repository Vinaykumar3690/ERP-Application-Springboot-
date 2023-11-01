package com.gitlab.adilcan.erp.commercial;

import com.gitlab.adilcan.erp.commercial.enumeration.*;
import com.gitlab.adilcan.erp.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer extends ThirdParty{


   


	public Customer(Long id, String reference, PaymentTerms paymentTerms, PaymentTypes paymentTypes, String publicNote,
			String privateNote, Currency currency, List<Contract> contracts) {
		super(id, reference, paymentTerms, paymentTypes, publicNote, privateNote, currency, contracts);
		// TODO Auto-generated constructor stub
	}

	private String customerReference;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private Source source;

    private AvailabilityDelay availabilityDelay;

    private ShippingMethod shippingMethod;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deliveryDate;

    private IncoTerms incoTerms;

    private DefaultDocTemplate defaultDocTemplate;

    @OneToMany(mappedBy = "customer")
    private List<Contract> contracts;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public AvailabilityDelay getAvailabilityDelay() {
		return availabilityDelay;
	}

	public void setAvailabilityDelay(AvailabilityDelay availabilityDelay) {
		this.availabilityDelay = availabilityDelay;
	}

	public ShippingMethod getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(ShippingMethod shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public IncoTerms getIncoTerms() {
		return incoTerms;
	}

	public void setIncoTerms(IncoTerms incoTerms) {
		this.incoTerms = incoTerms;
	}

	public DefaultDocTemplate getDefaultDocTemplate() {
		return defaultDocTemplate;
	}

	public void setDefaultDocTemplate(DefaultDocTemplate defaultDocTemplate) {
		this.defaultDocTemplate = defaultDocTemplate;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	

	
    

}

