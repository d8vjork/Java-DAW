import javax.swing.JOptionPane;

public class Herederos {
    
    public static void main( String[] args ) {
    
        String gen = JOptionPane.showInputDialog( "¿Cuántas generaciones hay?" );

        int hec = 1000;
        int total = 0;
        
        // Convert String to Integer
        int n = Integer.parseInt(gen);
        
        for ( int i = 1; i <= n; i++ ) {
            String chl = JOptionPane.showInputDialog("Introduce hijos de la " + i + "º geneneración");
            total = total + Integer.parseInt(chl);
        }
    
        JOptionPane.showMessageDialog( null, "De los " + total + " herederos obtienen " + hec / total + " hectáreas cada uno." );

    }
    
}
