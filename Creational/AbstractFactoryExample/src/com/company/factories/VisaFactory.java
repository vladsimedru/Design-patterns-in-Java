package com.company.factories;

import com.company.creditCards.CardType;
import com.company.creditCards.CreditCard;
import com.company.validators.Validator;
import com.company.creditCards.VisaPlatinumCreditCard;
import com.company.creditCards.VisaGoldCreditCard;
import com.company.validators.VisaGoldValidator;
import com.company.validators.VisaPlatinumValidator;

public class VisaFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:{
                return new VisaPlatinumCreditCard();
            }
            default:{
                return null;
            }
        }
    }

    @Override
    public Validator getValidator(CardType cardType){
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
            default:
                return null;
        }
    }
}
