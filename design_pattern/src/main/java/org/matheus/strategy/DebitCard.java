package org.matheus.strategy;

public class DebitCard implements  IPaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pago com cartão de débito.");
    }
}
