package com.company.factories;

import com.company.creditCards.AmexGoldCreditCard;
import com.company.validators.AmexGoldValidator;
import com.company.creditCards.AmexPlatinumCreditCard;
import com.company.validators.AmexPlatinumValidator;
import com.company.creditCards.CardType;
import com.company.creditCards.CreditCard;
import com.company.validators.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }
}
