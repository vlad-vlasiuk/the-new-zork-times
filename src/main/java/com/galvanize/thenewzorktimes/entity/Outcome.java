package com.galvanize.thenewzorktimes.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Outcome {

    String networkStatus; //"network_status": "not_sent_to_network",
    String reason; //"reason": "highest_risk_level",
    String riskLevel; //"risk_level": "highest",
    String riskScore; //        "risk_score": 91,
    String rule; //"rule": "block_if_high_risk__enabled",
    String sellerMessage; //"seller_message": "Stripe blocked this payment as too risky.",
    String type; //"type": "blocked"

    @Builder
    public Outcome(String networkStatus, String reason, String riskLevel, String riskScore, String rule,
                   String sellerMessage, String type) {
        this.networkStatus = networkStatus;
        this.reason = reason;
        this.riskLevel = riskLevel;
        this.riskScore = riskScore;
        this.rule = rule;
        this.sellerMessage = sellerMessage;
        this.type = type;
    }
}
