package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator workClass = new Calculator();
        System.out.println("a + b = " + workClass.add(2,2));
        try {
            System.out.println("a . b = " + workClass.div(2, 2));
        } catch (Exception ex) {

        }

        System.out.println( "App Finish" );

    }
}
