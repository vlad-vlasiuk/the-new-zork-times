package com.galvanize.thenewzorktimes.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Source {
    String id; //"id": "card_1DgzUB2eZvKYlo2Cf4Y71vbA",
    String object; //"object": "card",
    String address_city; //"address_city": null,
    String address_country;//"address_country": null,
    String address_line1; //"address_line1": null,
    String address_line1_check; //"address_line1_check": null,
    String address_line2;//"address_line2": null,
    String address_state;//"address_state": null,
    String address_zip;//"address_zip": null,
    String address_zip_check;//"address_zip_check": null,
    String brand;//"brand": "Visa",
    String country;//"country": "US",
    String customer; //"customer": "cus_E9I4fj0YA2RCCd",
    String cvc_check; //"cvc_check": "unavailable",
    String dynamic_last4;//"dynamic_last4": null,
    String exp_month;//"exp_month": 12,
    String exp_year;//"exp_year": 2022,
    String fingerprint;// "fingerprint": "yTFMYiPXiPa5AoSn",
    String funding;//"funding": "credit",
    String last4;//"last4": "4954",
    String metadata;//"metadata": { },
    String name;//"name": "muneeb@gmail.com",
    String tokenization_method;//"tokenization_method": null

    @Builder
    public Source(String id, String object, String address_city, String address_country, String address_line1,
                  String address_line1_check, String address_line2, String address_state, String address_zip,
                  String address_zip_check, String brand, String country, String customer, String cvc_check,
                  String dynamic_last4, String exp_month, String exp_year, String fingerprint, String funding,
                  String last4, String metadata, String name, String tokenization_method) {
        this.id = id;
        this.object = object;
        this.address_city = address_city;
        this.address_country = address_country;
        this.address_line1 = address_line1;
        this.address_line1_check = address_line1_check;
        this.address_line2 = address_line2;
        this.address_state = address_state;
        this.address_zip = address_zip;
        this.address_zip_check = address_zip_check;
        this.brand = brand;
        this.country = country;
        this.customer = customer;
        this.cvc_check = cvc_check;
        this.dynamic_last4 = dynamic_last4;
        this.exp_month = exp_month;
        this.exp_year = exp_year;
        this.fingerprint = fingerprint;
        this.funding = funding;
        this.last4 = last4;
        this.metadata = metadata;
        this.name = name;
        this.tokenization_method = tokenization_method;
    }
}
