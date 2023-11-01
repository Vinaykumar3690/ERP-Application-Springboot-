package com.gitlab.adilcan.erp.commercial;

import com.gitlab.adilcan.erp.commercial.enumeration.*;
import com.gitlab.adilcan.erp.domain.BaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_table")
public class Order extends BaseEntity{

    private String reference;

    @ManyToOne
    private Customer customer;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date plannedDateDelivery;

    private PaymentTerms paymentTerms;

    private PaymentTypes paymentTypes;

    private AvailabilityDelay availabilityDelay;

    private ShippingMethod shippingMethod;

    private Source source;

    private DefaultDocTemplate defaultDocTemplate;

    private IncoTerms incoTerms;

    private Currency currency;

    @Lob
    private String publicNote;

    @Lob
    private String privateNote;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getPlannedDateDelivery() {
		return plannedDateDelivery;
	}

	public void setPlannedDateDelivery(Date plannedDateDelivery) {
		this.plannedDateDelivery = plannedDateDelivery;
	}

	public PaymentTerms getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(PaymentTerms paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public PaymentTypes getPaymentTypes() {
		return paymentTypes;
	}

	public void setPaymentTypes(PaymentTypes paymentTypes) {
		this.paymentTypes = paymentTypes;
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

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public DefaultDocTemplate getDefaultDocTemplate() {
		return defaultDocTemplate;
	}

	public void setDefaultDocTemplate(DefaultDocTemplate defaultDocTemplate) {
		this.defaultDocTemplate = defaultDocTemplate;
	}

	public IncoTerms getIncoTerms() {
		return incoTerms;
	}

	public void setIncoTerms(IncoTerms incoTerms) {
		this.incoTerms = incoTerms;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getPublicNote() {
		return publicNote;
	}

	public void setPublicNote(String publicNote) {
		this.publicNote = publicNote;
	}

	public String getPrivateNote() {
		return privateNote;
	}

	public void setPrivateNote(String privateNote) {
		this.privateNote = privateNote;
	}

	public Order(Long id, String reference, Customer customer, Date date, Date plannedDateDelivery,
			PaymentTerms paymentTerms, PaymentTypes paymentTypes, AvailabilityDelay availabilityDelay,
			ShippingMethod shippingMethod, Source source, DefaultDocTemplate defaultDocTemplate, IncoTerms incoTerms,
			Currency currency, String publicNote, String privateNote) {
		super(id);
		this.reference = reference;
		this.customer = customer;
		this.date = date;
		this.plannedDateDelivery = plannedDateDelivery;
		this.paymentTerms = paymentTerms;
		this.paymentTypes = paymentTypes;
		this.availabilityDelay = availabilityDelay;
		this.shippingMethod = shippingMethod;
		this.source = source;
		this.defaultDocTemplate = defaultDocTemplate;
		this.incoTerms = incoTerms;
		this.currency = currency;
		this.publicNote = publicNote;
		this.privateNote = privateNote;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}
    
    
    
}
