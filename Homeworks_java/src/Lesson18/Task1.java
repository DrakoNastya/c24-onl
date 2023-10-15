package Lesson18;
//Задача 1:
//Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
//содержимое тегов line записать в другой документ. Название файла для записи должно
//состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("C:\\Users\\ad800\\c24-onl_Homeworks\\Homeworks_java\\src\\Lesson18\\sonnet.xml"));
        Element sonnet = document.getDocumentElement();
        Element author = (Element) sonnet.getElementsByTagName("author").item(0);
        String firstName = author.getElementsByTagName("firstName").item(0).getTextContent();
        String lastName = author.getElementsByTagName("lastName").item(0).getTextContent();
        String title = sonnet.getElementsByTagName("title").item(0).getTextContent();
        NodeList line = sonnet.getElementsByTagName("lines");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < line.getLength(); i++) {
            str.append(line.item(i).getTextContent());
        }
        File file = new File("Homeworks_java/src/Lesson18/Task1.java" + firstName + lastName + title + ".txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(str.toString());
        }

    }
}
