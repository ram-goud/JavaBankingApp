package net.javaguidelines.banking.mapper;

import net.javaguidelines.banking.dto.AccountDto;
import net.javaguidelines.banking.entity.Account;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(accountDto.getId(),accountDto.getAccountHolderName(),accountDto.getBalance());
		return account;
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountdto = new AccountDto(account.getId(),account.getAccountHolderName(),account.getBalance());
		return accountdto;
	}
}
