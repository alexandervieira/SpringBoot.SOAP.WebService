package com.asilva.soap.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.asilva.soap.schema.GetPessoaRequest;
import com.asilva.soap.schema.GetPessoaResponse;

@Endpoint
public class PessoaEndpoint {

    private static final String NAMESPACE_URI = "http://schema.soap.asilva.com/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPessoaRequest")
    @ResponsePayload
    public GetPessoaResponse getPessoa(@RequestPayload GetPessoaRequest request) {
        GetPessoaResponse response = new GetPessoaResponse();
        response.setNome("João Silva");
        response.setIdade(30);
        return response;
    }
}
