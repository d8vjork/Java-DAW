import javax.swing.JOptionPane;

public class Principal {
    
    public static void main( String[] args ) {
        
        int n = Integer.parseInt( JOptionPane.showInputDialog("Introduzca el número de alumnos") );
        
        if (n > 0) {
            
            float r = 0;
            
            for (int i = 1; i <= n; i++) {
                float x = Float.parseFloat( JOptionPane.showInputDialog( "Introduce la " + i + "ª nota" ) );
                r = r + x;
            }
            
            r = r / n;
            
            JOptionPane.showMessageDialog( null, "La media es de " + r, "Media de las notas", JOptionPane.INFORMATION_MESSAGE );
        
        } else {
            JOptionPane.showMessageDialog( null, "El valor de N no puede ser menor que 0", "Error!", JOptionPane.ERROR_MESSAGE );
        }
        
    }
    
}
