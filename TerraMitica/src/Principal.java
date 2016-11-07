import javax.swing.JOptionPane;

public class Principal {
    
    public static void main( String[] args ) {

        int bebes = 0, ninos = 0, adultos = 0, edad = 0;
        
        do {
            
            String n = JOptionPane.showInputDialog( "Introduzca edad" );
            
            try {

                edad = Integer.parseInt(n);
                
                if (edad != -1) {
                
                    if (edad >= 0 && edad < 4) {
                        bebes++;
                    } else if (edad >= 4 && edad <= 12) {
                        ninos++;
                    } else if (edad > 12 && edad < 150) {
                        adultos++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduzca una edad correcta!!");
                    }
                }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Formato incorrecto!");
            }
            
        } while ( edad != -1 );
        
        JOptionPane.showMessageDialog(null, "Bebés: " + bebes + ", niños: " + ninos + ", adultos: " + adultos + "\nEntradas vendidas: " + bebes + ninos + adultos + "\nCajas: " + (ninos * 20 + adultos * 40) + "¤");
        
    }
    
}
