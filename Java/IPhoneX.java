public class IPhoneX{


/**
* Class is the plan of IPhoneX 
* Now we will send this to China to build IPhoneX for us
*
 */

// myIphoneX  =  by using new keyword you invoke constructor to create myIPhoneX
// IPhoneX() --> Constructor --> Same as class name with ();
//IPhoneX  myIPhoneX = new IPhoneX();
// Declaratin if object
 //IPhoneX  myIPhoneX;
 // Create object
 //myIPhoneX = new IPhoneX();

 // Funtion = method 

 // Here name of the function is call
 // Method does some job
 // call() method able to make call

// This is the main gate of your house/ of your application
// Mainmethod syntex can't be altered
// JVM only understands whatever inside this main method 
// or anything mehtod having relationship with the main method

 public static void main(String[] args){
       IPhoneX myIPhoneX = new IPhoneX();
       // Calling using myIphone
       // By doing this we have created a Relationship with main() method and call() method 
       myIPhoneX.call();
    }

 public void call(){

     System.out.println("This method can make a call");

    }

 }