package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileControl {
    private File file;

    public FileControl(String fileName) {
        this.file = new File(fileName);
    }

    //used with updating and deleting data, IOException caught
    //argument: an array of Data(Lead/Interaction)
    //return nothing
    public void fileUpdateAll(Data[] listOfData) {
        try {
            PrintWriter output = new PrintWriter(this.file);
            for (Data data: listOfData){
                output.println(data.toFileFormat());
            }
            output.close();
        } catch (IOException ex) {
            System.out.print("IO problem with up updating files, error: " + ex.getMessage());
        }
    }

    public void fileUpdateAppend(Data data){
        //implements - Member: Tae
    }
}
