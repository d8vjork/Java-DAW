import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Principal {

    public static void main( String[] args ) {
        
        int n, nsec, xint = 5, intent = 0;
        boolean ace = false;
        
        nsec = ThreadLocalRandom.current().nextInt( 1, 10 + 1 );
        
        for ( int i = 1; i <= xint && ace == false; i++ ) {
            n = Integer.parseInt( JOptionPane.showInputDialog( "Intento N�" + i ) );
            
            if ( nsec == n ) {
                ace = true;
            } else if ( n > nsec ) {
                JOptionPane.showMessageDialog( null, "El n�mero secreto es menor" );
            } else {
                JOptionPane.showMessageDialog( null, "El n�mero secreto es mayor" );
            }
            
            intent++;
        }
        
        if( ace == true ) {
            JOptionPane.showMessageDialog( null, "Has acertado!\nN� de intentos realizados: " + intent );
        } else {
            JOptionPane.showMessageDialog( null, "N�mero máximo de intentos alcanzado" );
        }

    }

}
