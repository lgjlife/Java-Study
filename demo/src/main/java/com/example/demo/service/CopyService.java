package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.sql.Array;

@Slf4j
public class CopyService {

    private static String basePath = "/home/lgj/aProject/aRealPrj/Java-Interview";
    private static String allName = "all.md";
    private static String fileNames[] ={"util.md","computer-base.md","java.md","Thread.md","spring.md","message.md",
                                        "performance.md","high-concurrency.md","distribution.md","web-safe.md"};
    public static void run() {
        init();
        File file = new File(basePath);

        FileOutputStream fileOutputStream = null;
        FileInputStream  fileInputStream = null;
        try{


            fileOutputStream = new FileOutputStream(new File(basePath+"/"+allName),true);

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

    private static void init(){
        File file = new File(basePath+"/"+allName);
        if(file.exists()){
            log.info("[{}]存在,删除[{}]",allName,file.delete());
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
}
