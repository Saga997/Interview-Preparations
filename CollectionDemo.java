package com.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;

/*This class will have all the common methods demo that are applied to most of collection classes and interfaces
*/
public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> fruitCollection = new ArrayList<String>();
		
		//add method
		fruitCollection.add("Apple");
		fruitCollection.add("Mango");
		fruitCollection.add("Banana");
		fruitCollection.add("Kiwi");
		fruitCollection.add("Grapes");
		System.out.println("Initial collection:"+fruitCollection);
		
		//remove method
		fruitCollection.remove("Kiwi");
		System.out.println("After removing kiwi: "+fruitCollection);
		
		//iterating over the collection using forEach method
		System.out.println("-----Using forEach------");
		fruitCollection.forEach((element)->{
			System.out.println(element);
		});
		
		//iterating over the collection using enhance for loop 
		System.out.println("----Using Enhanced for Loop-----");
		for(String element:fruitCollection) {
			System.out.println(element);
		}

		//contains
		System.out.println("Contains method: "+fruitCollection.contains("Grapes"));
		
		Collection<String> vegCollection = new ArrayList<String>();
		vegCollection.add("Lady Finger");
		vegCollection.add("Cabbage");
		vegCollection.add("Tomato");

		System.out.println("Vegetable collection:"+vegCollection);
		
		//addALL
		Collection<String> vegan = new ArrayList<String>();
		vegan.addAll(vegCollection);
		vegan.addAll(fruitCollection);
		System.out.println("Vegan collection after addAll():"+vegan);


		
		
		//Hash code
		System.out.println("Hashcode of Vegan: "+vegan.hashCode());
		//clear method
		//fruitCollection.clear();
		//System.out.println("After clear() "+fruitCollection);
		
		//toArray
		System.out.println("Array after conversion"+ vegan instanceOf String);
		System.out.println(vegan.toString());
		
		
		//clear method
		fruitCollection.clear();
		vegCollection.clear();
		vegan.clear();
		System.out.println("After clear(): "+fruitCollection+vegan+vegCollection);

		
	}

}
