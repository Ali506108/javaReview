package com.example.SET;

import java.io.File;

public class MainEntery {

    public static void main(String[] args) {
        walkin(new File("C:\\Users\\Legion5\\Downloads\\R.jpg"));
    }

    public static void walkin(File dir) {
        String pattern = ".jpg";

        File[] listFiles = dir.listFiles();

        if(listFiles != null) {
            for(int i = 0; i < listFiles.length ; i++){
                if(listFiles[i].isDirectory()) {
                    walkin(listFiles[i]);
                } else if (listFiles[i].getName().endsWith(pattern)) {
                    System.out.println(listFiles[i].getPath());
                }
            }
        }
    }
}
