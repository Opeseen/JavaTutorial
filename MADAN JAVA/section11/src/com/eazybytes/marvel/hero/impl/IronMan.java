package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class IronMan implements SuperHero {

  @Override
  public String usePower() {
    System.out.println(UNIVERSE_NAME);
    return "Ironman using his power";
  }

  @Override
  public String stopVillain(char c) {
    if(c=='Y'){
      return "Ironman killed the villain";
    }else{
      return "Ironman stopped the villain";
    }

  }
}
