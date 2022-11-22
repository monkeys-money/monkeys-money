package br.com.fiap.fintech.monkeys_money.app.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InvestmentResponse {

	private Long id;
	private UserResponse user;
	private String investment;
	private String description;
	private BigDecimal amount;
	private LocalDateTime investmentAt;
	private LocalDateTime createAt;
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserResponse getUser() {
		return user;
	}

	public void setUser(UserResponse user) {
		this.user = user;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getInvestmentAt() {
		return investmentAt;
	}

	public void setInvestmentAt(LocalDateTime investmentAt) {
		this.investmentAt = investmentAt;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
