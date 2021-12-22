package com.company.validators;

import com.company.creditCards.CreditCard;

public class VisaGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
