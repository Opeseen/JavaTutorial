package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {

  @Override
  public String usePower() {
    return "Spiderman using his power";
  }

  @Override
  public String stopVillain(char c) {
    if (c == 'Y') {
      return "Spiderman killed the villain";
    } else {
      return "Spiderman stopped the villain";
    }
  }


}
