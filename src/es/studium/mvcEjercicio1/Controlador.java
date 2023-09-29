package es.studium.mvcEjercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Vista vista;
	Modelo modelo;
	
	public Controlador(Vista v, Modelo m)
	{
		v.ventana.addWindowListener(this);
		v.btnCelFah.addActionListener(this);
		v.btnFahCel.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(vista.btnCelFah))
		{
		float celsius = Float.parseFloat(vista.txtCelsius.getText());
		// °F = (°C x 9/5) + 32
		float fahrenheit = modelo.celsiusFahrenheit(celsius);
		vista.txtFahrenheit.setText(fahrenheit+"");
		}
		else
		{
		float fahrenheit = Float.parseFloat(vista.txtFahrenheit.getText());
		// °C = (°F - 32) x 5/9
		float celsius = modelo.fahrenheitCelsius(fahrenheit);
		vista.txtCelsius.setText(celsius+"");}
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
	}
	
}