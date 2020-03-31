package com.qualityhouse.serenity.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

import static com.qualityhouse.serenity.utils.Randomiser.randomizeValue;

/**
 * @author yakimfb
 * @since 19.03.20
 **/
public abstract class TestObjectFactory {
    private final static ObjectMapper mapper = new ObjectMapper();

    public static <T> T prepareTestObjectFrom(Class<T> objectType,
                                              Map<String, String> data) {
        Map<String, String> tuneupData = new HashMap<>();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            tuneupData.put(entry.getKey(),
                    randomizeValue(entry.getValue()));
        }

        return (T) mapper.convertValue(tuneupData,
                objectType);
    }
}
