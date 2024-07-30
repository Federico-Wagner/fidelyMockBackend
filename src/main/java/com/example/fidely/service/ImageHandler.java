package com.example.fidely.service;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class ImageHandler {

    public static Object readImage(String jsonFileName) {
        Object response;
        try{
            String filePath = "src/main/resources/responses/" + jsonFileName;
            byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
            String encodedImg =  Base64.getEncoder().encodeToString(fileContent);

            JSONObject jsonObject =  new JSONObject();
            jsonObject.put("data", encodedImg);
            jsonObject.put("contentType","image/png");
            jsonObject.put("url","http://google.com");


            response = jsonObject.toString();

        } catch (IOException e) {
            response = "Error, archivo no encontrado";
        }
        return response;
    }
}
