package com.dong.demo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by dchuan on 2016/3/13.
 */
public class JsonOutputHelper implements IOutputHelper {

    /**
     * Generate employee info on json and output on console
     * @param object
     */
    public void generateInfo(Object object) {

        // // Enable pretty json output
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(object);

        try {
            //write converted json data to a file named "file.json"
            FileWriter writer = new FileWriter("file.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output on console
        System.out.println(json);
    }
}
