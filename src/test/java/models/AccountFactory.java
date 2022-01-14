package models;

import com.github.javafaker.Faker;

public class AccountFactory {
    static Faker faker = new Faker();

    public static Account get() {
        return Account.builder()
                .accountName("Спартак")
                .webSite(faker.gameOfThrones().house())
                .parentAccount("Коммунарка")
                .phone(faker.phoneNumber().phoneNumber())
                .fax(faker.phoneNumber().phoneNumber())
                .type("Investor")
                .industry("Banking")
                .employees(faker.number().digit())
                .annualRevenue(faker.number().digit())
                .description(faker.princessBride().character())
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetAddress())
                .billingCity(faker.address().cityName())
                .billingStateProvince(faker.address().state())
                .shippingCity(faker.address().cityName())
                .shippingStateProvince(faker.address().state())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.address().country())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.address().country())
                .build();
    }
}