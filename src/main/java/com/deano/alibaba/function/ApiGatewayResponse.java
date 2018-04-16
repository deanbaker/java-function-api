package com.deano.alibaba.function;

import java.util.HashMap;
import java.util.Map;

public class ApiGatewayResponse<T> {

    private final boolean isBase64Encoded = false;
    private Integer statusCode = 200;
    private Map<String, String> headers = new HashMap<>();
    private final T body;

    public ApiGatewayResponse(T body) {
        this.body = body;
        headers.put("content-type", "text/plain");
    }

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public ApiGatewayResponse<T> setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public ApiGatewayResponse<T> addHeader(String name, String value) {
        this.headers.put(name, value);
        return this;
    }

    public T getBody() {
        return body;
    }

}

