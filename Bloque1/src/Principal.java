import javax.swing.JOptionPane;

public class Principal {
    
    public static void main( String[] args ) {
		
		int n = 0, m = 0, c = 0;

		try {
			n = Integer.parseInt( JOptionPane.showInputDialog( "Introduzca número:" ) );

			while ( n != 999 ) {
				
				if( c == 0 ) {
					m = n;
					c++;
				} else {

					if ( n > m ) {
						m = n;
						c = 1;
					} else {
						c++;
					}

				}

				try {
					n = Integer.parseInt( JOptionPane.showInputDialog( "Introduzca número:" ) );
				} catch (Exception e) {
					JOptionPane.showMessageDialog( null, "Formato incorrecto.", "Error fatal", JOptionPane.ERROR_MESSAGE );
				}

			}
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "Formato incorrecto.", "Error fatal", JOptionPane.ERROR_MESSAGE );
		}

		JOptionPane.showMessageDialog( null, "Mayor número: " + m + " (" + c + " repeticiones)" );

	}

}