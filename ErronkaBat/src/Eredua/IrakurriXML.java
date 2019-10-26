package Eredua;
import java.awt.List;
import java.io.BufferedReader;

import javax.swing.JFileChooser;
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

public class IrakurriXML {
	private static ArrayList<Departamentu> depLista = new ArrayList<Departamentu>();

	public IrakurriXML() {
	}

	public static void kargatuDepartamentu() {
    	 //Creamos el objeto JFileChooser
    	   JFileChooser fc=new JFileChooser();
    	    
    	   //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
    	   int seleccion=fc.showOpenDialog(fc);
    	    
    	   //Si el usuario, pincha en aceptar
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
        }
      }
    }

	public static ArrayList<Departamentu> getDepLista() {
		return depLista;
	}
		
	

}
