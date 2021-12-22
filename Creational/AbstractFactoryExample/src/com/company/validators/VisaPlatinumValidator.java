package com.company.validators;

import com.company.creditCards.CreditCard;

public class VisaPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
