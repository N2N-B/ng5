package pp;

import org.w3c.dom.*;//Provides the interface for DOM parser ,which is a component API used for XML processing.
import javax.xml.parsers.*;//Provides the classes which allows processing of an XML document using DOM and SAX parser.
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.*;//Defines the generic API for processing transformation instructions.
import javax.xml.transform.stream.*;//Defines the generic API for processing transformation instructions.
import java.io.*;

public class XmlGenerator {
	public static void main(String[] args) {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();// Defines a factory API
																								// which produces DOM
																								// object trees from an
																								// XML document
		DocumentBuilder documentBuilder = null;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();// Defines the API to obtain DOM document
																			// instance from an XML document
		} catch (ParserConfigurationException exception) {
			exception.printStackTrace();
		}

		Document document = documentBuilder.newDocument();

		Element rootelement = document.createElement("students");// Defining root element
		Element studentelement = document.createElement("student");// Defining sub-root element

		Element firstnameelement = document.createElement("firstname");// Creating child elements
		Element lastnameelement = document.createElement("lastname");// Creating child elements
		Element emailelement = document.createElement("email");// Creating child elements
		Element markselement = document.createElement("marks");// Creating child elements

		Text textnode1 = document.createTextNode("Naren");// Creating node data(text) elements
		Text textnode2 = document.createTextNode("Bagavathy");// Creating node data(text) elements
		Text textnode3 = document.createTextNode("rednan69@gmail.com");// Creating node data(text) elements
		Text textnode4 = document.createTextNode("780");// Document Object Module Parser

		firstnameelement.appendChild(textnode1);// Assigning values to child elements
		lastnameelement.appendChild(textnode2);// Assigning values to child elements
		emailelement.appendChild(textnode3);// Assigning values to child elements
		markselement.appendChild(textnode4);// Assigning values to child elements

		studentelement.appendChild(firstnameelement);// Assigning values of child elements to the sub-root element
		studentelement.appendChild(lastnameelement);// Assigning values of child elements to the sub-root element
		studentelement.appendChild(emailelement);// Assigning values of child elements to the sub-root element
		studentelement.appendChild(markselement);// Assigning values of child elements to the sub-root element

		rootelement.appendChild(studentelement);// Assigning value of sub-root element to the root element
		document.appendChild(rootelement);//// Assigning value of root element to the document
		Transformer transformer = null;

		try {
			transformer = TransformerFactory.newInstance().newTransformer();
		} catch (TransformerConfigurationException exception) {
			exception.printStackTrace();
		} catch (TransformerFactoryConfigurationError error) {
			error.printStackTrace();
		}
		try {
			transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream(
					"C:\\Users\\NAREN BAGAVATHY\\eclipse-workspace\\XtensibleMarkupLanguage\\src\\pp\\student.xml")));// The
																														// source
																														// created
																														// is
																														// copied
																														// in
																														// file
																														// which
																														// is
																														// present
																														// at
																														// given
																														// location.
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (TransformerException exception) {
			exception.printStackTrace();
		}
		System.out.println("XML file generated...");
	}

}