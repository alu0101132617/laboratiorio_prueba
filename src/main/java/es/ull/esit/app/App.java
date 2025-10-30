package es.ull.esit.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println( "This is a sample Java application." );
        # Adding errors for testing purposes in sonarQube
        int a = 5;
        int b = 0;
        int c = a / b; // This will cause a division by zero error
    }
}
