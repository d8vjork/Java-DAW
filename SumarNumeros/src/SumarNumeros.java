import javax.swing.JOptionPane;

public class SumarNumeros {
    
    public static void main( String[] args ) {

        String n = JOptionPane.showInputDialog( "Introduzca el valor de N" );
        
        int n2 = Integer.parseInt(n);
        
        // Eem.. noup!
        if ( n2 > 0 ) {
        
            int total = 0;

            for ( int i = 1; i <= n2; i++ ) {
                int ope = Integer.parseInt( JOptionPane.showInputDialog( "Introduce el " + i + "º valor" ) );
                total += ope;
            }

            JOptionPane.showMessageDialog( null, "El valor de las " + n + " sumas es de " + total, "Total", JOptionPane.INFORMATION_MESSAGE );
        } else {
            JOptionPane.showMessageDialog( null, "El valor de N no puede ser menor que 0", "Error!", JOptionPane.ERROR_MESSAGE );
        }

    }

}
