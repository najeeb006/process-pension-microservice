package com.cognizant.processpensionmicroservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BankDetail {
    private String bankName;					// Bank Name of the Pensioner Eg. SBI, HDFC etc.
    private String accountNumber;				// Account Number of the Pensioner
    private String bankType;
}
