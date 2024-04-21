package com.example.lab2.service;

import com.example.lab2.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime("");
        return response;
    }
}