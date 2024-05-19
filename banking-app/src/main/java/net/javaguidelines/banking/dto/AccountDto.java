package net.javaguidelines.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class AccountDto {
	private Long id;
	private String accountHolderName;
	private double balance;
	
	public AccountDto(Long id, String accountHolderName, double balance){
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAccountHolderName() {
		return this.accountHolderName;
	}
	
	public void setId(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setId(double balance) {
		this.balance = balance;
	}
}