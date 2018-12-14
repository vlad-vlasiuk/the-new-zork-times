package com.galvanize.thenewzorktimes.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Refund {
    String object; //"object": "list",
    List<String> data; //"data": [],
    Boolean has_more; //"has_more": false,
    Long totalCount; //"total_count": 0,
    String url; //"url": "/v1/charges/ch_1DgzUF2eZvKYlo2CJcMNgtr6/refunds"

    @Builder
    public Refund(String object, List<String> data, Boolean has_more, Long totalCount, String url) {
        this.object = object;
        this.data = data;
        this.has_more = has_more;
        this.totalCount = totalCount;
        this.url = url;
    }
}
