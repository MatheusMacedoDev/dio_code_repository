package org.matheus;

import org.matheus.facade.Facade;
import org.matheus.singleton.SingletonLazyHolder;
import org.matheus.strategy.CreditCard;
import org.matheus.strategy.DebitCard;
import org.matheus.strategy.Purchase;

public class Main {
    public static void main(String[] args) {
        // Singleton

        //SingletonLazyHolder singleton = new SingletonLazyHolder();
        SingletonLazyHolder singleton = SingletonLazyHolder.getInstance();
        System.out.println(singleton);
        SingletonLazyHolder singleton1 = SingletonLazyHolder.getInstance();
        System.out.println(singleton1);

        // Strategy

        Purchase purchase = new Purchase();
        purchase.setPaymentMethod(new CreditCard());
        purchase.pay();
        purchase.setPaymentMethod(new DebitCard());
        purchase.pay();

        // Facade

        Facade facade = new Facade();
        facade.migrateClient("Matheus", "097887-345");

    }
}