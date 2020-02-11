package com;


public class Cock extends Chicken {

  public double getPrice() { return 5; }

  public String getType() {
    return getClass().getSimpleName();
  }

}
