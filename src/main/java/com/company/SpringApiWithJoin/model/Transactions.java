package com.company.SpringApiWithJoin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Payments")
@EntityListeners(value = { AuditingEntityListener.class })
@JsonIgnoreProperties(value = "paymentDate", allowGetters=true)
public class Transactions implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int paymentID;
	
//	@Column(nullable =false)
//	//@NotBlank
//	//@ForeignKey
//	private int customerid;
	
	@Column(nullable = false)
	//@NotBlank
	
	private int staffID;
	
	@Column(nullable = false)
	//@NotBlank
	private double amount;
	
	@Column
	@NotBlank
	@CreatedDate
	@LastModifiedBy
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date paymentDate;
	
	/*
	 * 
	 *  @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
	 * */
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name ="customerID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;
	
	 

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

//	public int getCustomerid() {
//		return customerid;
//	}
//
//	public void setCustomerid(int customerid) {
//		this.customerid = customerid;
//	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Transactions [paymentID=" + paymentID + /*", customerid=" + customerid + "*/ "staffID=" + staffID
				+ ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + customerid;
		result = prime * result + ((paymentDate == null) ? 0 : paymentDate.hashCode());
		result = prime * result + paymentID;
		result = prime * result + staffID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transactions other = (Transactions) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
//		if (customerid != other.customerid)
//			return false;
		if (paymentDate == null) {
			if (other.paymentDate != null)
				return false;
		} else if (!paymentDate.equals(other.paymentDate))
			return false;
		if (paymentID != other.paymentID)
			return false;
		if (staffID != other.staffID)
			return false;
		return true;
	}
}
