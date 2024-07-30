package com.example.fidely.service;


import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import java.io.*;


public class JsonHandler {

    public static Object readJson(String jsonFileName) {
        Object object;
        try{
            FileReader fileReader = new FileReader("src/main/resources/responses/" + jsonFileName);
            object = new JSONParser(fileReader).parse();
        }catch (FileNotFoundException fne){
            object = "Error, archivo no encontrado";
        }catch (ParseException pe){
            object = "Error, fallo al parsear";
        }
        return object;
    }

}
