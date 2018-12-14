package com.galvanize.thenewzorktimes.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.thenewzorktimes.entity.ChargeResponse;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZorkServiceTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8889); // No-args constructor defaults to port 8080


    @Autowired
    private ZorkService service;

    @Test
    public void createCharge() throws JsonProcessingException {
        wireMockRule.stubFor(get(urlEqualTo("/v1/charges"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody(new ObjectMapper().writeValueAsBytes(ChargeResponse.builder().build()))));
        assertThat(service.createCharge(), is(nullValue()));
    }
}