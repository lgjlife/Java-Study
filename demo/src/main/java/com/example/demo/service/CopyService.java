package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.sql.Array;
import java.util.List;
import java.util.Properties;
import java.util.Set;

@Slf4j
public class CopyService {

    private static String basePath = "/home/lgj/aProject/aRealPrj/Java-Interview";
    private static String allName = "all.md";
    private static String fileNames[] ={"util.md","computer-base.md","java.md","Thread.md","spring.md","mysql.md","Redis.md","message.md",
                                        "nginx.md","web-cantainer.md","netty.md",
                                        "performance.md","high-concurrency.md","distribution.md","web-safe.md"};
    public static void run() {
        init("Java知识-1.md");
        handler("fileName1","Java知识-1.md");

        init("Java知识-2.md");
        handler("fileName2","Java知识-2.md");



    }

    private static void handler(String key,String distName){
        File file = new File(basePath);

        log.info("保存的文件名称:"+distName);
        FileOutputStream fileOutputStream = null;
        FileInputStream  fileInputStream = null;
        try{


            fileOutputStream = new FileOutputStream(new File(basePath+"/"+distName),true);
            fileNames = getFileList(key);
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

    private static void init(String fileName){
        File file = new File(basePath+"/"+fileName);
        if(file.exists()){
            log.info("[{}]存在,删除[{}]",fileName,file.delete());
            ;
        }

        try{
            file.createNewFile();
        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }
    }

    private static  class FilenameFilterImpl implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {

            if(allName.equals(name)){
                return false;
            }

            if("md".equals(getFileType(name))){
                return true;
            }

            return false;
        }


        private String getFileType(String name){
           String[] str =  name.split("\\.");

           if(str.length <= 1){
               return "xsafeafe";
           }
           return str[str.length-1];
        }
    }



    private  static String[] getFileList(String key ){

        String[] names = null;

       try{
           Properties properties = PropertiesLoaderUtils.loadProperties(new FileUrlResource("/home/lgj/aProject/aRealPrj/Java-Interview/fileName.properties"));
           String fileNames = (String)properties.get(key);
           Set<String> keys=  properties.stringPropertyNames();


           names = fileNames.split(",");
         //  System.out.println(fileNames);

       }
       catch(Exception ex){
           log.error(ex.getMessage());
       }

       return names;

    }


}
