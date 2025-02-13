package com.booleanuk.api.payload.response;

import com.booleanuk.api.payload.response.Response;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@NoArgsConstructor
public class ErrorResponse extends Response<Map<String, String>> {
    public void set(String message) {
        this.status = "error";

        Map<String, String> reply = new HashMap<>();
        reply.put("message", message);
        this.data = reply;
    }
}
