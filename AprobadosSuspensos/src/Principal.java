import javax.swing.JOptionPane;

public class Principal {

    public static void main( String[] args ) {
        int al = 5;
        int total = 0;
        int ap = 0;
        int su = 0;
        int di = 0;
        int ce = 0;
        
        for ( int i = 1; i <= al; i++ ) {
            
            int n = Integer.parseInt( JOptionPane.showInputDialog("Nota del alumno " + i + ":") );
            
            if ( n > 4 ) {
                ap++;
                if ( n == 10) {
                    di++;
                }
            } else {
                su++;
                if ( n == 0 ) {
                    ce++;
                }
            }
            
            total += n;
        }
        
        JOptionPane.showMessageDialog( null, ap + " alumnos aprobados (" + di + " con diez)" );
        JOptionPane.showMessageDialog( null, su + " alumnos suspendidos (" + ce + " con cero)" );
    }

}
