package com.deano.alibaba.function;

import com.alibaba.fastjson.JSON;
import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.StreamRequestHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class ApiGatewayStreamRequestHandler implements StreamRequestHandler {

    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

        ApiGatewayResponse response = invoke(input, output, context);
        output.write(JSON.toJSONString(response).getBytes());
    }

    abstract ApiGatewayResponse invoke(InputStream input, OutputStream output, Context context);
}
