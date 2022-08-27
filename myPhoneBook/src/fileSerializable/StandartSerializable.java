package fileSerializable;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;

public class StandartSerializable implements Runnable {

    void jsonSerializable() throws IOException {
        JsonPerson j = new JsonPerson("Sasha22", 45, 180, true);
        File f = new File("jsonSerializable.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(f, j);
        //писать результат сериализации будем во Writer(StringWriter)
        // StringWriter writer = new StringWriter();
//        OutputStream writer = new ObjectOutputStream(new FileOutputStream("jsonSerializable.json"));
//
//        //это объект Jackson, который выполняет сериализацию
//        ObjectMapper mapper = new ObjectMapper();
//
//        // сама сериализация: 1-куда, 2-что
//        mapper.writeValue(writer, j);

        //преобразовываем все записанное во StringWriter в строку
//        String result = writer.toString();
//        System.out.println(result);
    }

    void jsonDeserializable() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        File f = new File("jsonSerializable.json");
        JsonPerson j =  mapper.readValue(f, JsonPerson.class);
        System.out.println("Get from file");
        System.out.println(j.toString());
    }

    void simpleSerializable () {
        StandartPerson s = new StandartPerson("Sasha", 45, 180, true);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("standartSerializable.dat")))
        {
            oos.writeObject(s);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("standartSerializable.dat")))
        {
            StandartPerson p=(StandartPerson)ois.readObject();
            System.out.printf(p.toString());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }


    void xml() {
        XStream xstream = new XStream();
        XmlPerson s = new XmlPerson("Sasha", 45, 180, true);

        System.out.println(xstream.toXML(s));
    }

    @Override
    public void run() {
        try {
            xml();
//            jsonSerializable();
//            jsonDeserializable();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }
}
