package com.tms.lesson12;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User userOutput = new User("Alexa", 21, "Female");

        // serialization
        FileOutputStream fileStream = new FileOutputStream("./src/com/tms/lesson12/User.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fileStream);

        oos.writeObject(userOutput);
        oos.close();

        // deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/com/tms/lesson12/User.ser"));
        FileWriter fw = new FileWriter("./src/com/tms/lesson12/USER.txt");
        User userInput = (User) ois.readObject();
        fw.write(userInput.toString());

        ois.close();
        fw.close();
    }
}
