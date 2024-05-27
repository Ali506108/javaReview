package com.example.Scapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
    public static <T> T parseJson(String json, Class<T> clazz) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, clazz);
    }
}
