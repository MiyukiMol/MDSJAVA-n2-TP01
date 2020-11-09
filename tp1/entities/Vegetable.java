package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;

public class Vegetable implements Eatable {

  private long id;
  private String name;

  public Vegetable() {
  }

  public Vegetable(Long id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  
  // getter et setter
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void eat() {
	// TODO Auto-generated method stub
	
}

}
