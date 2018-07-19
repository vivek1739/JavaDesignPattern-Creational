package Fac;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class AbstractFac {
	
	public static void main(String[] args) {
		
		String xml= "<doc> <body> <stock> VIVEK </stock></body></doc>";
		
		ByteArrayInputStream bais=new ByteArrayInputStream(xml.getBytes());
		
		Document doc;
		try {
			DocumentBuilderFactory abstractFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder factory=abstractFactory.newDocumentBuilder();
			doc = factory.parse(bais);
			//.normalize();
			System.out.println(doc.getDocumentElement().getTextContent());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
