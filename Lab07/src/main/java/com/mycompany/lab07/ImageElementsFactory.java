package com.mycompany.lab07;

import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

  public ImageElement getFlyweight(String n) {
      String key = String.valueOf(n);
      if (flyweights.containsKey(key)) {
          return flyweights.get(key);
      } else {
          ImageElement imageElement = new ImageElement(n);
          flyweights.put(key, imageElement);
          return imageElement;
      }
  }

  public int numberOfFlyweights() {
    return flyweights.size();
  }

}
