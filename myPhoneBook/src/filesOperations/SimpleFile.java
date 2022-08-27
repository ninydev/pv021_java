package filesOperations;

import java.io.*;

public class SimpleFile implements Runnable
{
    private String fileName ="text.txt";
    private String text = "Hello world!";

    FileOutputStream out;
    BufferedOutputStream bos;

    public SimpleFile() throws FileNotFoundException {
        out = new FileOutputStream(fileName);
        bos = new BufferedOutputStream(out);
    }

    private void  firstData() throws IOException {
        String t = "First text";
        bos.write(t.getBytes());
    }

    private void  secondData() throws IOException {
        String t = "Second text";
        bos.write(t.getBytes());
    }


    @Override
    public void run() {
        try {
            firstData();
            secondData();
            bos.flush();
            // out.close();


//            writeFileByte();
//            readFileByte();


        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }





    private void writeFileByte() throws IOException {
        FileOutputStream fos=new FileOutputStream(fileName);
        byte[] buffer = text.getBytes();
        fos.write(buffer, 0, buffer.length);
        System.out.println("The file has been written");
        fos.close();
    }

    private void readFileByte() throws IOException {
        FileInputStream fin=new FileInputStream(fileName);
        System.out.printf("File size: %d bytes \n", fin.available());

        int i=-1;
        while((i=fin.read())!=-1){
            System.out.print((char)i);
        }
        fin.close();
    }

}
