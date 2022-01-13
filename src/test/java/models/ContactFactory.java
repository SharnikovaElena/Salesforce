package models;

import com.github.javafaker.Faker;

public class ContactFactory {

   static Faker faker = new Faker();

    public static Contact get() {
        return Contact.builder().salutation("Mrs.")
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .accountName("Спартак")
                .title(faker.pokemon().name())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .reportsTo(faker.artist().name())
                .mailingStreet(faker.address().streetAddress())
                .mailingCity(faker.address().cityName())
                .mailingStateProvince(faker.address().state())
                .mailingZipCode(faker.address().zipCode())
                .mailingCountry(faker.address().country())
                .otherStreet("-")
                .otherCity("-")
                .otherStateProvince("-")
                .otherZipCode("-")
                .otherCountry("-")
                .fax(faker.phoneNumber().phoneNumber())
                .homePhone(faker.phoneNumber().phoneNumber())
                .otherPhone("-")
                .asstPhone(faker.phoneNumber().phoneNumber())
                .assistant(faker.artist().name())
                .department(faker.commerce().department())
                .leadSource("On Site")
                .birthdate("12/12/1995")
                .description(faker.princessBride().character())
                .build();
    }
}
