package com.codingjump.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.codingjump.soap.countries.GetCountryRequest;
import com.codingjump.soap.countries.GetCountryResponse;

@Endpoint
public class CountryEndpoint {
    public static final String NAMESPACE_URI = "http://codingjump.com/soap/countries";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry("USA");

        return response;
    }
}