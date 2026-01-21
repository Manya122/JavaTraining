package com.training.assignment.three;

import java.io.*;

public class Q3_SerializationDemo {

    public static void main(String[] args) {

        Q3_Employee e =
            new Q3_Employee(1, "Manya",
                new Q3_Address("Delhi", "Delhi"), 50000);

        // -------- Serialize --------
        try (ObjectOutputStream oos =
             new ObjectOutputStream(
                 new FileOutputStream("resources/emp.dat"))) {

            oos.writeObject(e);
            System.out.println("Object Serialized\n");

        } catch (IOException ex) {
            System.out.println(ex);
        }

        //Deserialize 
        try (ObjectInputStream ois =
             new ObjectInputStream(
                 new FileInputStream("resources/emp.dat"))) {

            Q3_Employee emp = (Q3_Employee) ois.readObject();

            System.out.println("After Deserialization:");
            emp.display();   // salary will be 0.0

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
