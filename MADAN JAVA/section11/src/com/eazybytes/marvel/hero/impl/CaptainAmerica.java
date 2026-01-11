package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {

  @Override
  public String usePower() {
    return "CaptainAmerica using his power";
  }

  @Override
  public String stopVillain(char c) {
    if (c == 'Y') {
      return "CaptainAmerica killed the villain";
    } else {
      return "CaptainAmerica stopped the villain";
    }
  }

}
