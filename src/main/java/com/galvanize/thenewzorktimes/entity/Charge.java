package com.galvanize.thenewzorktimes.entity;

/*

sk_test_4eC39HqLyjWDarjtT1zdp7dc: \
   -d amount=2000 \
   -d currency=usd \
   -d source=tok_mastercard \
   -d description="Charge for jenny.rosen@example.com"

 */


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
public class Charge {

    String apiKey;
    BigDecimal amount;
    Currency currency;
    Source source;
    String description;

    @Builder
    public Charge(String apiKey, BigDecimal amount, Currency currency, Source source, String description) {
        this.apiKey = apiKey;
        this.amount = amount;
        this.currency = currency;
        this.source = source;
        this.description = description;
    }
}
