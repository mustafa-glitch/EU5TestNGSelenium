package com.cybertek.test;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class firstclass {
    public static void main(String[] args) {
        System.out.println("hello world");
        Faker faker=new Faker();
        System.out.println(faker.beer().name());
        System.out.println(faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));
    }
}
