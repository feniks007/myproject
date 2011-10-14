/**
 * Some basic Java examples to get started.
 */
package org.aslaug.basic;

/**
 * The mandatory 'Hello World' example to start with. It could be a lot shorter,
 * but I prefer an object oriented programming style.
 * 
 * @author AslaugSoft
 */
public class HelloWorld {

	/**
	 * A main method is required is you want to be able to execute a class. The
	 * main method is typically used to start your complete Java program. Note
	 * that when developing server side application you'll not (not to say
	 * never) need a main class as the server will typically call your classes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In here you'll find what the application is all about. All we do is
		 * create our HelloWorld class and call a method on it.
		 */
		// create an instance of the HelloWorld class.
		HelloWorld aHelloWorldInstance = new HelloWorld();

		// call the sayHello of the HelloWorld instance named
		// aHelloWorldInstance
		aHelloWorldInstance.sayHello();

	}

	/**
	 * A default constructor.
	 */
	public HelloWorld() {
		// nothing in here. We could have omitted the constructor.
	}

	public void sayHello() {
		/**
		 * The 'System' class is our gate to the environment our program is
		 * running in. 'out' points to standard output of our environment. It's
		 * an object, so we can call methods on it. 'println()' will print the
		 * line we provide as parameter, in this case to standard output.
		 */
		System.out.println("Hello World!");
	}

}
