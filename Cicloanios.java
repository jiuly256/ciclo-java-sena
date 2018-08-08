/*
Jiuly Alexandra Rojas
hhtps://jiuly.com.ve
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Cicloanios extends Applet implements ActionListener {
TextField tfSueldo,tfPorcentaje, tfAnios;//entradas de texto
Label lSueldo,lPorcentaje,lAnios;//label de los textos de entrada
Button boton;
TextArea txtResultado;//Campo de texto para mostrar el resultado
//método constructor,donde se crean los objetos a dibujar en el applet
public Cicloanios() {
//Damos la instruccion que no se usará ningun layout para poder dibujar con setBounds
this.setLayout((null));
//setBounds(posicionx, posiciony, ancho, alto)
lSueldo= new Label("Sueldo: ");
lSueldo.setBounds(20, 20, 100, 20);
lPorcentaje= new Label("% Aumento: ");
lPorcentaje.setBounds(20, 40, 100, 20);
lAnios= new Label("A\u00f1os: ");
lAnios.setBounds(20, 60, 100, 20);
tfSueldo = new TextField(); 
tfSueldo.setBounds(120, 20, 100, 20);
tfPorcentaje = new TextField();
tfPorcentaje.setBounds(120, 40, 100, 20);
tfAnios = new TextField();
tfAnios.setBounds(120, 60, 100, 20);
boton = new Button("Calcular");
boton.setBounds(120,100,100,20);
txtResultado=new TextArea();
txtResultado.setBounds(20,140,300,200);
//agregamos los elementos a la pantalla
add(lSueldo);
add(lPorcentaje);
add(lAnios);
add(tfSueldo);
add(tfPorcentaje);
add(tfAnios);
add(txtResultado);
add(boton);
 boton. addActionListener(this); // se le añade al boton la facilidad de ser escuchado

}
//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
this.setSize(340, 600);


}
// método para realizar las opciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
	double sueldo = Double.parseDouble(tfSueldo.getText());
	double interes = Double.parseDouble(tfPorcentaje.getText());
	int anios = Integer.parseInt(tfAnios.getText());
    
	txtResultado.setText("");
	int anio = 1;
	//DecimalFormat formateador = new DecimalFormat("###,###.##");
	DecimalFormat formateador = new DecimalFormat("###,###");
	while (anio < anios+1) {
		if (anio == 1){
			sueldo=sueldo;
			txtResultado.append(" A\u00f1o " + anio + "\u0020\u0020\u0020 \u0020$" + formateador.format (sueldo) + "\n\n");
		}
		else{
			sueldo += (sueldo * (interes/100));
			txtResultado.append(" A\u00f1o " + anio + "\u0020\u0020\u0020 \u0020$" + formateador.format (sueldo) + "\n\n");
		}
		anio ++;
	}

}
}
