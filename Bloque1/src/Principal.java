import javax.swing.JOptionPane;

public class Principal {
    
    public static void main( String[] args ) {
		
		int n = 0, m = 0, c = 0;

		try {
			n = Integer.parseInt( JOptionPane.showInputDialog( "Introduzca n�mero:" ) );

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
					n = Integer.parseInt( JOptionPane.showInputDialog( "Introduzca n�mero:" ) );
				} catch (Exception e) {
					JOptionPane.showMessageDialog( null, "Formato incorrecto.", "Error fatal", JOptionPane.ERROR_MESSAGE );
				}

			}
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "Formato incorrecto.", "Error fatal", JOptionPane.ERROR_MESSAGE );
		}

		JOptionPane.showMessageDialog( null, "Mayor n�mero: " + m + " (" + c + " repeticiones)" );

	}

}