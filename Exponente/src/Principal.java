import javax.swing.JOptionPane;

public class Principal {

	public static void main( String[] args ) {

		try {
			int x, n = Integer.parseInt( JOptionPane.showInputDialog( "Introduce número base:" ) );
			int e = Integer.parseInt( JOptionPane.showInputDialog( "Introduce un exponente:" ) );

			if ( e > 0 ) {
				x = n;

				for ( int i = 0; i < (e - 1); i++ ) {
					x = x * n;
				}

				JOptionPane.showMessageDialog( null, "Resultado de " + n + " con exponente " + e + ": " + x );

			} else {
				JOptionPane.showMessageDialog( null, "Exponente no puede ser menor que 0.", "Error fatal", JOptionPane.ERROR_MESSAGE );
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "Formato incorrecto.", "Error fatal", JOptionPane.ERROR_MESSAGE );
		}

	}

}