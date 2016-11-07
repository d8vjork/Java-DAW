public class Principal {

	public static void main( String[] args ){
        
        long a = 1, b = 1, c; 

        System.out.println(a);
        System.out.println(b);
        
        for ( long i = 0; i <= 100; i++ ) {
            c = a + b;
            a = b;
            b = c;
            
            System.out.println(c);
        }
		
    }

}
