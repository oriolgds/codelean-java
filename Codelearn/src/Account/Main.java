package Account;

public class Main {
    public static void main ( String[] args ) {

        Account ac1 = new Account ( "User 1" );

        Account ac2 = new Account ( "User 2", 300 );

        // Cash deposit

        ac1.deposit ( 300 );

        ac2.deposit ( 400 );

        // Cash withdrawal

        ac1.withdrawal ( 300 );

        ac2.withdrawal ( 100 );

        // Show accounts information

        System.out.println ( ac1 ); // 0 euros

        System.out.println ( ac2 ); // 600 euros

    }
}
