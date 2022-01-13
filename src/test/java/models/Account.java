package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Account {
    String accountName;
    String webSite;
    String parentAccount;
    String phone;
    String fax;
    String type;
    String industry;
    String employees;
    String annualRevenue;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingStateProvince;
    String shippingCity;
    String shippingStateProvince;
    String billingZip;
    String billingCountry;
    String shippingZip;
    String shippingCountry;

}
