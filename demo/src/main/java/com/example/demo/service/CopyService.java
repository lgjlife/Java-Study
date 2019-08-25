package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

@Slf4j
public class CopyService {

    private static String basePath = "/home/lgj/aProject/aRealPrj/Java-Interview";
    private static String fileOutputBase = basePath + "/output";
    private static String filPropertiesPath = fileOutputBase + "/fileName.properties";
    private static String fileOutputMdPath = fileOutputBase + "/pdf";

    private static String fileBaseName = "Java-";

    private static int fileCount = 0;


    public static void run() {
        Set<String> propertyNames = getPropertyNames();

        log.info("propertyNames = " + propertyNames);

        List<String[]> results = getFileList1("fileName1");

        deleteAll();
        for(String[] result:results){
            String fileName = getFileName(fileCount++);
            init(fileName);
            handler(result,fileName);

        }



    }

    private static String getFileName(int count){
        return fileBaseName + count + ".md";
    }

    private static void handler(String[] fileNames,String distName){

        System.out.println();

        log.info("The save name is :"+distName);
        FileOutputStream fileOutputStream = null;
        FileInputStream  fileInputStream = null;
        try{


            fileOutputStream = new FileOutputStream(new File(fileOutputMdPath+"/"+distName),true);
           // String[] fileNames = getFileList(key);
            for(String fileName:fileNames){
                log.info("select md file = " +  fileName);

                fileInputStream = new FileInputStream(new File(basePath+"/"+fileName));

                byte[] buff= new byte[2000];
                int len = 0;
                while ((len = fileInputStream.read(buff)) != -1){
                    fileOutputStream.write(buff,0,len);
                }
                fileOutputStream.flush();
            }

        }
        catch(Exception ex){
            log.error(ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            try{

                if(fileOutputStream!= null){
                    fileOutputStream.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            }
            catch(Exception ex){
                log.error(ex.getMessage());
            }
        }
    }

    private static void deleteAll(){

        log.info("Delete file list  ....");
        File file = new File(fileOutputMdPath);

        File[] files = file.listFiles();

        for(int i = 0; i<files.length ; i++){
            boolean delete = files[i].delete();

            log.info("Delete File [{}] :{}",files[i].getAbsolutePath(),delete);

        }

        System.out.println();
    }

    private static void init(String fileName){
        File file = new File(fileOutputMdPath+"/"+fileName);
        try{
            boolean create = file.createNewFile();

            log.info("Create File [{}] :{}",file.getAbsolutePath(),create);

        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }
    }

    private static Set<String> getPropertyNames(){
        Set<String> keys = null;
        try{
            Properties properties = PropertiesLoaderUtils
                    .loadProperties(new FileUrlResource(filPropertiesPath));
            keys=  properties.stringPropertyNames();


        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }

        return keys;

    }

    private  static String[] getFileList(String key ){

        String[] names = null;

       try{
           Properties properties = PropertiesLoaderUtils
                   .loadProperties(new FileUrlResource(filPropertiesPath));
           String fileNames = (String)properties.get(key);
           names = fileNames.split(",");
         //  System.out.println(fileNames);

       }
       catch(Exception ex){
           log.error(ex.getMessage());
       }

       return names;

    }

    private  static List<String[]> getFileList1(String key ){

        List<String[]> result = new ArrayList<>();


        try{
            Properties properties = PropertiesLoaderUtils
                    .loadProperties(new FileUrlResource(filPropertiesPath));
            String fileNames = (String)properties.get(key);

            String[] names1 = null;
            names1 = fileNames.split("=");



            for(int i = 0; i< names1.length; i++){

                int start = names1[i].indexOf(",");
                int end = names1[i].lastIndexOf(",");
                if(start == 0 ){
                    start = 1;
                }
                else{
                    start = 0;
                }
                if(end != names1[i].length()){
                    end = names1[i].length();
                }


                String temp = names1[i].substring(start,end);
                result.add(temp.split(","));

            }

            //  System.out.println(fileNames);

        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }

        return result;

    }

    public static void main(String args[]){

        deleteAll();
    }
   /* public static void main(String args[]){
        try{
            Properties properties = PropertiesLoaderUtils
                    .loadProperties(new FileUrlResource("/home/lgj/aProject/aRealPrj/Java-Interview/filePDF/fileName.properties"));
            //String fileNames = (String)properties.get(key);
            Set<String> keys=  properties.stringPropertyNames();

            System.out.println(keys);


            System.out.println("--------------");
            List<String[]> result = getFileList1("fileName1");

            result.forEach((value)->{
                System.out.println("+++++");
                for(int i = 0; i< value.length; i++){
                    System.out.println(value[i]);
                }
            });

            System.out.println();
        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }
    }*/

}
