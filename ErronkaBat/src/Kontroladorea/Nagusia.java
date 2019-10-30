package Kontroladorea;

import java.util.ArrayList;
import java.util.Iterator;

import Eredua.Departamentu;
import Eredua.IrakurriFitxategi;
import Eredua.Konexioa;
import Leihoak.KudeatuDepart;
import Leihoak.KudeatuEmple;
import Leihoak.MenuNagusi;
import Leihoak.PantailaDepart;
import Leihoak.PantailaEmple;

public class Nagusia {
	//Atributuak:
	private Kontroladorea kontrol;
	private MenuNagusi MenuPantail;
	private PantailaDepart DepartPantail;
	private PantailaEmple EmplePantail;
	private KudeatuDepart PantailaKudeatuDepart;
	private KudeatuEmple PantailaKudeatuEmple;
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Nagusia printzipala = new Nagusia();
		printzipala.iniciar();	
		
		/*ira.kargatuDepartamentuXML();
		ArrayList<Departamentu> depLista = ira.getDepLista();
		for (int i = 0; i < depLista.size(); i++) {
			kon.insertDepart(depLista.get(i));
		}
		ira.kargatuDepartamentuCSV();
		depLista = ira.getDepLista();
		for (int i = 0; i < depLista.size(); i++) {
			kon.insertDepart(depLista.get(i));
		}
		
		//kon.insertDepart(depLista.get(0));*/
		
		
	}

	private void iniciar() {
		MenuPantail = new MenuNagusi();
		DepartPantail = new PantailaDepart();
		EmplePantail = new PantailaEmple();
		kontrol = new Kontroladorea();
		PantailaKudeatuDepart = new KudeatuDepart();
		PantailaKudeatuEmple = new KudeatuEmple();
		//Hemen kodigoa egin behar da.
		MenuPantail.setcoordinador(kontrol);
		DepartPantail.setcoordinador(kontrol);
		EmplePantail.setcoordinador(kontrol);
		PantailaKudeatuDepart.setcoordinador(kontrol);
		PantailaKudeatuEmple.setcoordinador(kontrol);
		//Aqui hay que poner todo los enlaces
		kontrol.setMenua(MenuPantail);
		kontrol.setDepartPantaila(DepartPantail);
		kontrol.setEmplePantaila(EmplePantail);
		kontrol.setKudeatuDepartPantaila(PantailaKudeatuDepart);
		kontrol.setKudeatuEmplePantaila(PantailaKudeatuEmple);
		
		//Pantaila ikusi.
		kontrol.bistaratuMenua();
	
	}
	
	
}
