package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class AgeDeserializer extends JsonDeserializer<Integer> {
  @Override
  public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    if (text == null || text.isEmpty()) {
      return 0;
    } else {
      return Integer.valueOf(text);
    }
  }
}
