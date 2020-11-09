package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void eat() {
	// TODO Auto-generated method stub
	
}

@Override
public void move() {
	if(this instanceof Terrestrial) {
		System.out.println("Your Dog named " + getName() + " just move walking");
	}else if (this instanceof Aquatic) {
		System.out.println("Your Dog named " + getName() + " just move swimming");
	}else {
		System.out.println("Your Dog named " + getName() + " just move walking");
		System.out.println("Your Dog named " + getName() + " just move swimming");
	}
	
}

@Override
public void eat(Eatable eatable) {
	if(this instanceof Omnivorus) {
		System.out.println("Your Dog named " + getName() + " just eat viande");
		System.out.println("Your Dog named " + getName() + " just eat herbe");
	}else if (this instanceof Herbivorus) {
	      if (eatable instanceof Vegetable) {
	          System.out.println("Your Dog named " + getName() + " just eat herbe");
	          
	        } else {
	        	System.out.println("Your Dog named " + getName() + " cannot eat viande");
	        }
    } else if (this instanceof Carnivorus) {
        if (eatable instanceof Animal) {
          System.out.println("Your Dog named " + getName() + " just eat viande");
        } else {

        }
      }
	
}
}
