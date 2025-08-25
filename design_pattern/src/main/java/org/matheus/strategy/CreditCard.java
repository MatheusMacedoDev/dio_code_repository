package org.matheus.strategy;

public class CreditCard implements  IPaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pago com cartão de crédito.");
    }
}
