package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Contact {
    String salutation;
    String firstName;
    String lastName;
    String accountName;
    String title;
    String phone;
    String mobile;
    String email;
    String reportsTo;
    String mailingStreet;
    String mailingCity;
    String mailingStateProvince;
    String mailingZipCode;
    String mailingCountry;
    String otherStreet;
    String otherCity;
    String otherStateProvince;
    String otherZipCode;
    String otherCountry;
    String fax;
    String homePhone;
    String otherPhone;
    String asstPhone;
    String assistant;
    String department;
    String leadSource;
    String birthdate;
    String description;

}
