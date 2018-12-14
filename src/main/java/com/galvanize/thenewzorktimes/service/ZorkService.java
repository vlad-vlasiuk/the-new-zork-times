package com.galvanize.thenewzorktimes.service;


import com.galvanize.thenewzorktimes.entity.Charge;
import com.galvanize.thenewzorktimes.entity.ChargeResponse;
import com.galvanize.thenewzorktimes.entity.Currency;
import com.galvanize.thenewzorktimes.entity.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class ZorkService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZorkService.class);

    private static final String URL_CHARGES = "http://localhost:8889/v1/charges";

    private final RestTemplate restTemplate;

    @Autowired
    public ZorkService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ChargeResponse createCharge() {


        Charge charge = Charge.builder()
                .apiKey("sk_test_4eC39HqLyjWDarjtT1zdp7dc")
                .amount(new BigDecimal(20000.00))
                .currency(Currency.USD)
                .source(Source.builder()
                        .build())
                .description("Charge for jenny.rosen@example.com")
                .build();

        ResponseEntity<ChargeResponse> responseEntity =
                restTemplate.postForEntity(URL_CHARGES, charge, ChargeResponse.class);

        ChargeResponse chargeResponse = responseEntity.getBody();

        LOGGER.info("Response from https://stripe.com : {}", chargeResponse);

        return chargeResponse;

    }

}
