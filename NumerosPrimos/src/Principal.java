import javax.swing.JOptionPane;

public class Principal {
	
	public static void main( String[] args ) {

		int a = 0, num = Integer.parseInt( JOptionPane.showInputDialog( "Ingrese un número:" ) );

		for ( int i = 1; i < (num + 1); i++ ) {

			if ( num % i == 0 ) {
				a++;
			}

		}

		System.out.println(a);

		if ( a != 2 ) {
			JOptionPane.showMessageDialog( null, "No es primo.");
		} else {
			JOptionPane.showMessageDialog( null, "Es primo.");
		}

		// Exit execution
		System.exit(0);

	}

}