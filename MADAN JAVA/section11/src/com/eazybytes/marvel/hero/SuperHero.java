package com.eazybytes.marvel.hero;

public interface SuperHero extends Person, Hero {
  String UNIVERSE_NAME = "Marvel";
  String usePower();
  String stopVillain(char c);

  default String trakLiveLocation(){
    String liveLocation = "USA";
    System.out.println("I am in " + liveLocation);
    return liveLocation;
  }

  static String commonCharacteristics(){
    return "Superhuman abilities, willingness to sacrifice";
  }

  @Override
  default void walk(){
    System.out.println("Playing");
  }

}
