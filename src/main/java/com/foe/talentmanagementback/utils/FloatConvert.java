package com.foe.talentmanagementback.utils;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;


public class FloatConvert extends JsonSerializer<Float> {

    private DecimalFormat df = new DecimalFormat("0.0");

    /**
     * 小数保留2位返回给前端序列化器
     * @param data
     * @param jsonGenerator
     * @param serializerProvider
     * @throws IOException
     */
    @Override
    public void serialize(Float data, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        try{
        if (data != null) {
            if (data == 0) {
                jsonGenerator.writeString("0");
            } else {
                jsonGenerator.writeString(df.format(data));
            }

        }
        }catch (IOException ioException){
            return;
        }
    }
}
