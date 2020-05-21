package capitulo11_8;

// Fig. 11.16: PruebaBoton.java
// Prueba de MarcoBoton.
import javax.swing.JFrame;

public class PruebaBoton
{
    public static void main( String args[] )
    {
        MarcoBoton marcoBoton = new MarcoBoton(); // crea MarcoBoton
        marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoton.setSize( 300, 210 ); // establece el tamaño del marco
        marcoBoton.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaBoton