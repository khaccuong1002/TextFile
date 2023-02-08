package com.codegym;

import java.io.*;

public class CopyFile {
    public static final String filePath = "/Users/admin/Desktop/Module two/lesson-16/CopyFileText/src/com/codegym";
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(new File(filePath + "/index1.txt"));
            outputStream = new FileOutputStream(new File(filePath + "/index2.txt"));
            int length;
            byte[] buffer = new byte[100];

            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
            }
            System.out.println("Tập tin được sao chép thành công!");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Tệp không tồn tại");
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
