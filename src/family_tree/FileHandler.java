package family_tree;

import java.io.*;

public class FileHandler implements Writable {
    //Сериализация в файл с помощью класса ObjectOutputStream
    public boolean save(Serializable serializable, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
  
        // Десериализация из файла с помощью класса ObjectInputStream
        public Object read(String file) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                return objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
  
    // public boolean save(Serializable serializable, String file){
    //     ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream(file));
    //     objectOutputStream.writeObject(serializable);
    //     objectOutputStream.close();
    // }

    // public Object read(String file){
    //     ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
    //     objectInputStream.close();
    //     return objectInputStream.readObject();
    // }
}
