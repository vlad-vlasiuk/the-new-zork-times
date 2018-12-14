package com.galvanize.thenewzorktimes.entity;
/*
{

}
 */


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;

@Data
@NoArgsConstructor
public class ChargeResponse {

    String id; //"id": "ch_1DgzUF2eZvKYlo2CJcMNgtr6",
    String object = "charge"; // "object":"charge",
    BigDecimal amount;//              "amount":100000,
    BigDecimal amountRefunded; //"amount_refunded":0,
    String application; //"application":null,
    String applicationFee; //"application_fee":null,
    String balanceTransaction; //"balance_transaction":"txn_19XJJ02eZvKYlo2ClwuJ1rbA",
    Boolean captured; //"captured":false,
    Long created; //"created":1544727883,
    Currency currency; //"currency":"usd",
    String customer; //"customer":"cus_E9I4fj0YA2RCCd",
    String description; //"description":"kt97dlf09wy2053mw211jeu1",
    String destination;//"destination":null,
    String dispute; //"dispute":null,
    String failureCode;//"failure_code":"card_declined",
    String failureMessage; //"failure_message":"Your card was declined.",
    Map<String, String> fraudDetails; //"fraud_details": {},

    String invoice;
    Boolean livemode;//       "livemode": false,
    //"metadata": { },
    String onBehalfOf; //"on_behalf_of": null,
    String order;        //"order": null,
    Outcome outcome;//        "outcome": {},
    Boolean paid;//"paid": false,
    String paymentIntent; //"payment_intent": null,
    String receiptEmail;//"receipt_email": null,
    String receiptNumber; //"receipt_number": null,
    Boolean refunded; //"refunded": false,
    Refund refunds; //"refunds": { },
    String review;//"review": null,
    String shipping; //"shipping": null,
    Source source;//"source": {},
    String sourceTransfer; //"source_transfer": null,
    String statementDescriptor; //"statement_descriptor": null,
    String status; //"status": "failed",
    String transfer_group; //"transfer_group": null

    @Builder
    public ChargeResponse(String id, String object, BigDecimal amount, BigDecimal amountRefunded,
                          String application, String applicationFee, String balanceTransaction,
                          Boolean captured, Long created, Currency currency, String customer,
                          String description, String destination, String dispute, String failureCode,
                          String failureMessage, Map<String, String> fraudDetails, String invoice,
                          Boolean livemode, String onBehalfOf, String order, Outcome outcome, Boolean paid,
                          String paymentIntent, String receiptEmail, String receiptNumber, Boolean refunded,
                          Refund refunds, String review, String shipping, Source source, String sourceTransfer,
                          String statementDescriptor, String status, String transfer_group) {
        this.id = id;
        this.object = object;
        this.amount = amount;
        this.amountRefunded = amountRefunded;
        this.application = application;
        this.applicationFee = applicationFee;
        this.balanceTransaction = balanceTransaction;
        this.captured = captured;
        this.created = created;
        this.currency = currency;
        this.customer = customer;
        this.description = description;
        this.destination = destination;
        this.dispute = dispute;
        this.failureCode = failureCode;
        this.failureMessage = failureMessage;
        this.fraudDetails = fraudDetails;
        this.invoice = invoice;
        this.livemode = livemode;
        this.onBehalfOf = onBehalfOf;
        this.order = order;
        this.outcome = outcome;
        this.paid = paid;
        this.paymentIntent = paymentIntent;
        this.receiptEmail = receiptEmail;
        this.receiptNumber = receiptNumber;
        this.refunded = refunded;
        this.refunds = refunds;
        this.review = review;
        this.shipping = shipping;
        this.source = source;
        this.sourceTransfer = sourceTransfer;
        this.statementDescriptor = statementDescriptor;
        this.status = status;
        this.transfer_group = transfer_group;
    }
}
