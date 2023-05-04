package individual.task3;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class SaveService {

    public void save(Map<Person, Address> personAddressMap, String fileName) {
        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(personAddressMap);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<Person, Address> read(String fileName) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            Map<Person, Address> personAddressMap = (TreeMap) objectInputStream.readObject();
            objectInputStream.close();
            return personAddressMap;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
