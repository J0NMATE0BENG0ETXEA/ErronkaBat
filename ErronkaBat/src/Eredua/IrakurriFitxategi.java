package Eredua;
import java.awt.List;
import java.io.BufferedReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
import java.sql.SQLException;
import java.util.ArrayList;

public class IrakurriFitxategi {
	private File file;
	private FileReader fr;
	private BufferedReader br;
	 //Sortzen dugu JFileChooser objektua.
	private JFileChooser fc=new JFileChooser();
	private static ArrayList<Emplegatu> empleLista = new ArrayList<Emplegatu>();
	private static ArrayList<Departamentu> depLista = new ArrayList<Departamentu>();

	public IrakurriFitxategi() {
	}

	
	
	
	public void kargatuDepartamentuXML() {
			depLista.removeAll(depLista);
			
			//Aukeratu behar duena esaten diogu
			fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			 
			//Filtro deklaratzen dugu
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.XML", "xml");
			 
			//Filtro jartzen dugu
			fc.setFileFilter(filtro);
			
			//Lehioa irekitzen da, bezeroaren erabakia gordetzen dugu.
    	   int seleccion=fc.showOpenDialog(fc);
    	    
    	   //Bezeroa ados pulsatzen badu.
    	   if(seleccion==JFileChooser.APPROVE_OPTION)  	{ 			
		
		try {
            //File archivo = new File("../ErronkaCasa/prueba.xml");
			File archivo = fc.getSelectedFile();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            
            Document document = documentBuilder.parse(archivo);
            
            document.getDocumentElement().normalize();
            
            NodeList lista = document.getElementsByTagName("departamentua");
            
            for(int i = 0 ; i < lista.getLength() ; i++) {
                Node nodo = lista.item(i);
                
                if(nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodo;
            		Departamentu aux = new Departamentu();
    				aux.sartuDatuak(element.getElementsByTagName("kodea").item(0).getTextContent(), 
    						element.getElementsByTagName("izena").item(0).getTextContent()
    						, element.getElementsByTagName("kokapena").item(0).getTextContent(), 
    						element.getElementsByTagName("dizena").item(0).getTextContent());    			
    				
    				depLista.add(aux);
                }
            }
            
        } catch(Exception e) {
            e.printStackTrace();
			   if(e.getCause() instanceof SQLException){
				      JOptionPane.showMessageDialog(null, "Zerbait txarto dago!");
				    } 
        }
      }
    }

	
	public void kargatuEmplegatuXML() {
		depLista.removeAll(depLista);
		
		//Aukeratu behar duena esaten diogu
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		 
		//Filtro deklaratzen dugu
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.XML", "xml");
		 
		//Filtro jartzen dugu
		fc.setFileFilter(filtro);
		
		//Lehioa irekitzen da, bezeroaren erabakia gordetzen dugu.
	   int seleccion=fc.showOpenDialog(fc);
	    
	   //Bezeroa ados pulsatzen badu.
	   if(seleccion==JFileChooser.APPROVE_OPTION)  	{ 			
	
	try {
        //File archivo = new File("../ErronkaCasa/prueba.xml");
		File archivo = fc.getSelectedFile();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        
        Document document = documentBuilder.parse(archivo);
        
        document.getDocumentElement().normalize();
        
        NodeList lista = document.getElementsByTagName("emplegatu");
        
        for(int i = 0 ; i < lista.getLength() ; i++) {
            Node nodo = lista.item(i);
            
            if(nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nodo;
        		Emplegatu aux = new Emplegatu();    			       		
        		
				aux.sartuDatuak(element.getElementsByTagName("ekodea").item(0).getTextContent(), 
						element.getElementsByTagName("dkodea").item(0).getTextContent(), 
						element.getElementsByTagName("izena").item(0).getTextContent(), 
						element.getElementsByTagName("abizena").item(0).getTextContent(),
						element.getElementsByTagName("data").item(0).getTextContent(),
						element.getElementsByTagName("ordua").item(0).getTextContent(),
						element.getElementsByTagName("betebeharra").item(0).getTextContent());
				
				empleLista.add(aux);
            }
        }
        
    } catch(Exception e) {
        e.printStackTrace();
		   if(e.getCause() instanceof SQLException){
			      JOptionPane.showMessageDialog(null, "Zerbait txarto dago!");
			    } 
    }
  }
}
	
	
	public void kargatuEmplegatuCSV() {
		depLista.removeAll(depLista);
		
		//Aukeratu behar duena esaten diogu
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		 
		//Filtro deklaratzen dugu
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CSV", "csv");
		 
		//Filtro jartzen dugu
		fc.setFileFilter(filtro);
		
		//Lehioa irekitzen da, bezeroaren erabakia gordetzen dugu.
 	   int seleccion=fc.showOpenDialog(fc);
 	    
 	   //Bezeroa ados pulsatzen badu.
 	   if(seleccion==JFileChooser.APPROVE_OPTION)  	{ 
		try {
			file = fc.getSelectedFile();
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// Irakurri fitxeroa
			String linea;
			int kont = 0;
			// String[] datuak = new ArrayList <String>();
			while ((linea = br.readLine()) != null) {
				if (kont != 0) {
					String[] datuak = linea.split(",");
					Emplegatu emple = new Emplegatu();
					emple.sartuDatuak(datuak[0].replace("\"", ""), datuak[1].replace("\"", ""), datuak[2].replace("\"", ""), 
									datuak[3].replace("\"", ""), datuak[4].replace("\"", ""), 
									datuak[5].replace("\"", ""), datuak[6].replace("\"", ""));

					empleLista.add(emple);
				}
				kont++;
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
	}

	
	public void kargatuDepartamentuCSV() {
		depLista.removeAll(depLista);
		
		//Aukeratu behar duena esaten diogu
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		 
		//Filtro deklaratzen dugu
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CSV", "csv");
		 
		//Filtro jartzen dugu
		fc.setFileFilter(filtro);
		
		//Lehioa irekitzen da, bezeroaren erabakia gordetzen dugu.
 	   int seleccion=fc.showOpenDialog(fc);
 	    
 	   //Bezeroa ados pulsatzen badu.
 	   if(seleccion==JFileChooser.APPROVE_OPTION)  	{ 
		try {
			file = fc.getSelectedFile();
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// Irakurri fitxeroa
			String linea;
			int kont = 0;
			// String[] datuak = new ArrayList <String>();
			while ((linea = br.readLine()) != null) {
				if (kont != 0) {
					System.out.println(linea);
					String[] datuak = linea.split(",");
					Departamentu dep = new Departamentu();
					dep.sartuDatuak(datuak[0].replace("\"", ""), datuak[1].replace("\"", ""), datuak[2].replace("\"", ""), datuak[3].replace("\"", ""));

					depLista.add(dep);
				}	
				kont++;
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
	}
	
	
	public static ArrayList<Emplegatu> getEmpleLista() {
		return empleLista;
	}

	public static ArrayList<Departamentu> getDepLista() {
		return depLista;
	}
		
	

}
