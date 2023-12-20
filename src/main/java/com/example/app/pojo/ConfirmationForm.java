package com.example.app.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmationForm { 
    private String confirmation;

	public ConfirmationForm(String confirmation) {
		super();
		this.confirmation = confirmation;
	}

	public ConfirmationForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	@Override
	public String toString() {
		return "ConfirmationForm [confirmation=" + confirmation + "]";
	} 
    
} 