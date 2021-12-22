package com.company.validators;

import com.company.creditCards.CreditCard;

public interface Validator {
    boolean isValid(CreditCard creditCard);
}
