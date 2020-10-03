package com.james;
import java.util.Random;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
  	Random rand = new Random();
    Student[] clones = new Student[12];
    for (int i = 0; i < clones.length; i++) {
    	clones[i] = new Student();
    	clones[i].gpa = 4 * rand.nextDouble();
    	double cloneGPA = Math.floor(clones[i].gpa * 100) / 100;
    	System.out.print(clones[i].name + " number " + (i+1) + " has a GPA of " + cloneGPA + ". ");
    	if (cloneGPA == 4) {
    		System.out.println("STELLAR!");
    	} else if (cloneGPA >= 3) {
    		System.out.println("This " + clones[i].name + " is doing just fine.");
    	} else if ((cloneGPA < 3) && (cloneGPA >= 2)) {
    		System.out.println("Check in on this " + clones[i].name + ".");
    	} else if ((cloneGPA < 2) && (cloneGPA >= 1)) {
    		System.out.println("This " + clones[i].name + " isn't doing too good.");
    	} else {
    		System.out.println("Uh oh.");
    	}
    }
  }
}
