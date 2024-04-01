package com.jasper.buffer;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteDemo1 {
    public static void main(String[] args) {
                long start = System.currentTimeMillis();
                try(FileInputStream in =
                        new FileInputStream("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\buffer\\贺自强简历.pdf");
                    FileOutputStream ou =
                        new FileOutputStream("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\buffer\\贺自强简历-副本.pdf")
                ){
                    int content;
                    while ((content=in.read())!=-1){
                        ou.write(content);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
    }
}
