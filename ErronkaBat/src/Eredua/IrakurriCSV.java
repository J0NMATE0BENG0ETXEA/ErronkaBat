package Eredua;
import java.awt.List;
import java.io.BufferedReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IrakurriCSV {
	private File file;
	private FileReader fr;
	private BufferedReader br;
	private static ArrayList<Emplegatu> empleLista = new ArrayList<Emplegatu>();
	private static ArrayList<Departamentu> depLista = new ArrayList<Departamentu>();
	

	public IrakurriCSV() {
	}

	public void kargatuEmplegatu() {
		try {
			file = new File("../OharraCSV/src/eredua/Oharrak.csv");
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// Irakurri fitxeroa
			String linea;
			int kont = 0;
			// String[] datuak = new ArrayList <String>();
			while ((linea = br.readLine()) != null) {
				String[] datuak = linea.split(",");

				Emplegatu emple = new Emplegatu();
				emple.sartuDatuak(Integer.parseInt(datuak[0]), Integer.parseInt(datuak[1]), datuak[2], 
									datuak[3], datuak[4], datuak[5], datuak[6]);


				empleLista.add(emple);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fitxeroa itxi.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

	
	public void kargatuDepartamentu() {
		try {
			file = new File("/home/elorrieta/Escritorio/prueba.csv");
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// Irakurri fitxeroa
			String linea;
			//int kont = 0;
			// String[] datuak = new ArrayList <String>();
			while ((linea = br.readLine()) != null) {
				String[] datuak = linea.split(",");

				Departamentu dep = new Departamentu();
				dep.sartuDatuak(datuak[0], datuak[1], datuak[2], datuak[3]);

				depLista.add(dep);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fitxeroa itxi.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
	
	
	
	public static ArrayList<Emplegatu> getEmpleLista() {
		return empleLista;
	}
	
	
	public static ArrayList<Departamentu> getDepLista() {
		return depLista;
	}


	/*public void oharBatSartu(Oharra datua) {
		oharLista.add(datua);
	}*/

	/*public ArrayList<Oharra> getOharLista() {
		return oharLista;
	}*/
	
	
}
