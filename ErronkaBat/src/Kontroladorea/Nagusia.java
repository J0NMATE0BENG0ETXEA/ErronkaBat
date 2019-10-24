package Kontroladorea;

import java.util.ArrayList;
import java.util.Iterator;

import Eredua.Departamentu;
import Eredua.IrakurriCSV;
import Eredua.IrakurriXML;
import Eredua.Konexioa;

public class Nagusia {
	//Atributuak:
	
	public static void main(String[] args) throws ClassNotFoundException {
		/*Nagusia printzipala = new Nagusia();
		printzipala.iniciar();	*/
		

		Kontsultak kon = new Kontsultak();
		
		/*IrakurriCSV irakurri = new IrakurriCSV();
		irakurri.kargatuDepartamentu();
		ArrayList<Departamentu> depLista = irakurri.getDepLista();
		
		for (int i = 0; i < depLista.size() -1; i++) {
			kon.insertDepartamentu(depLista.get(i));
		}*/
		
		IrakurriXML ira = new IrakurriXML();
		ira.kargatuDepartamentu();
		ArrayList<Departamentu> depLista = ira.getDepLista();
		for (int i = 0; i < depLista.size() -1; i++) {
			kon.insertDepartamentu(depLista.get(i));
		}
		
	}

	private void iniciar() {
		//Menukontroladorea kontrol = new Menukontroladorea();
		//Hemen kodigoa egin behar da.
		//Aqui hay que poner todo los enlaces
	
	}
	
	
}
