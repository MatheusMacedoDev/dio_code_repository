package org.matheus.strategy;

public class Purchase {

    private IPaymentMethod paymentMethod;

    public void pay() {
        paymentMethod.pay();
    }

    public void setPaymentMethod(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
