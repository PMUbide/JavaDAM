package com.pruebaMaven.practicaMaven;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class leeXML {
	

public static ArrayList<String[]> leerArchivo(String ruta) {

//  public static void main (String[] args) {
	  // Instantiate the Factory
//	  String ruta = "files/texto.xml";
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      ArrayList<String[]> palabras = new ArrayList<String[]>();
      try {
          // optional, but recommended
          // process XML securely, avoid attacks like XML External Entities (XXE)
          dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
          // parse XML file
          DocumentBuilder db = dbf.newDocumentBuilder();
          Document doc = db.parse(new File(ruta));
          // optional, but recommended
          // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
          doc.getDocumentElement().normalize();
          System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
          System.out.println("------");
          NodeList list = doc.getElementsByTagName("cadena");
          System.out.println(list.getLength());
          for (int temp = 0; temp < list.getLength(); temp++) {
              Node node = list.item(temp);
              if (node.getNodeType() == Node.ELEMENT_NODE) {
                String palabra = doc.getElementsByTagName("palabra").item(temp).getTextContent();
                String vocales = doc.getElementsByTagName("vocales").item(temp).getTextContent();
                String consonantes = doc.getElementsByTagName("consonantes").item(temp).getTextContent();
//               System.out.println(palabra + " " + vocales + " " + consonantes);
                String[] array = {palabra, vocales, consonantes};
                palabras.add(array);
              }
          }
      } catch (ParserConfigurationException | SAXException | IOException e) {
          e.printStackTrace();
      }
      for (String[] strings : palabras) {
		System.out.println(strings[0] + " "+ strings[1] + " "+ strings[2]);
	}
      return palabras;
  }
  
 
  

}