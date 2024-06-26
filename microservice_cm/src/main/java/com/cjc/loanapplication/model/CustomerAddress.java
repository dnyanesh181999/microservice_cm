package com.cjc.loanapplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerAddressId ;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerPermanent permanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerLocal localAddress;
}
