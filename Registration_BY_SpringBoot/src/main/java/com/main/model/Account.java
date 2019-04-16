package com.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Account {
	@ManyToOne
	@JoinColumn(name="id")
	private Registration register;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int primeId;
	@Column(name = "ACCOUNT_NUMBER")
	private long accId;
	@Column(name = "ACCOUNT_TYPE")
	private String accType;
	@Column(name = "ACCOUNT_BALANCE")
	private long accBalance;
	@Column(name = "TERM_TENURE")
	private int tenure;
	@Column(name = "TERM_INTEREST")
	private float interest;
	@Column(name = "TERM_MATURE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date matureDate;
	@Column(name = "ACCOUNT_CREATED_DATE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date createdDate;
	@Column(name = "ACCOUNT_UPDATED_DATE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date updatedDate;
	@Column(name = "TERM_AMOUNT")
	private long termAmt;

	public Registration getRegister() {
		return register;
	}

	public void setRegister(Registration register) {
		this.register = register;
	}

	public int getPrimeId() {
		return primeId;
	}

	public void setPrimeId(int primeId) {
		this.primeId = primeId;
	}

	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(long accBalance) {
		this.accBalance = accBalance;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public Date getMatureDate() {
		return matureDate;
	}

	public void setMatureDate(Date matureDate) {
		this.matureDate = matureDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public long getTermAmt() {
		return termAmt;
	}

	public void setTermAmt(long termAmt) {
		this.termAmt = termAmt;
	}

}
