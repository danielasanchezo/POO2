import javax.swing.JOptionPane;

public class Flecha {

int longitud;
String color;


public Flecha() {
	longitud=18;
	color="negro";
}


public Flecha(int longitud, String color) {
	this.longitud=longitud;
	this.color=color;
}

public void construirFlecha() {
	for (int i = 0; i < longitud; i++) {
		imprime("-");
	}
	imprime(">");
}

private void imprime(String simbolo) {
	if(color.equals("negro")) {
		System.out.print(simbolo);
	}
	else {
		System.err.print(simbolo);
	}
}
public void imprimirEspacio() {
	System.out.println();
}


}