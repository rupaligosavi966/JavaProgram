//.Example3.Write a Java program to c
//	Write a Java program to create a base class Sports with a method called play(). 
//Create three subclasses: Football, Basketball, and Rugby.
//Override the play() method in each subclass to play a specific statement for each sport.
package Example3.com;

//Sports Class
class Sports {
 // Play Method
 public void play() {
     System.out.println("Playing a sport");
 }
}

//Subclass Football
class Football extends Sports {
 // Override the play() method for Football
 @Override
 public void play() {
     System.out.println("Playing Football");
 }
}

//Subclass Basketball
class Basketball extends Sports {
 // Override the play() method for Basketball
 @Override
 public void play() {
     System.out.println("Playing Basketball");
 }
}

//Subclass Rugby
class Rugby extends Sports {
 // Override the play() method for Rugby
 @Override
 public void play() {
     System.out.println("Playing Rugby");
 }
}

//Main class to test the Sports and its subclasses
public class Sport {
 public static void main(String[] args) {
     // Create instances of Football, Basketball, and Rugby
     Football football = new Football();
     Basketball basketball = new Basketball();
     Rugby rugby = new Rugby();

     // Call the play() method on each object
     football.play();
     basketball.play();
     rugby.play();
 }
}
