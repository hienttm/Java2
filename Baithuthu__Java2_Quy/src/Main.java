
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Student> list = new ArrayList<>();
    static String path = "student.dat";

    public static void main(String[] args) {
        list = getData();
        int menuID = 0;
        do {
            menu();
            System.out.print("Menu : ");
            menuID = sc.nextInt();
            sc.nextLine();
            switch (menuID) {
                case 1:
                    insert();
                    break;
                case 2:
                    save();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    System.out.println("End program!");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menuID != 4);
    }

    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("1. Add new student");
        System.out.println("2. Save to student.dat");
        System.out.println("3. Display all students");
        System.out.println("4. Exit");
        System.out.println("-----------------------");
    }

    private static void insert() {
        System.out.println("Add student ->");
        Student student = new Student();
        student.inputStudent();
        list.add(student);
        System.out.println("Add student successfull!");
        save();
    }

    private static void save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (list.isEmpty()) {
            System.out.println("Current list is empty!");
        } else {
            try {
                fos = new FileOutputStream(path);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                System.out.println("Save successful!");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (oos != null) {
                    try {
                        oos.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }

    private static void displayAll() {
        list = getData();
        if (list.size() > 0) {
            System.out.printf("%10s %15s %15s\n", "EnrolID", "Full name", "Age");
            System.out.println("---------- -------------------- ----------");
            for (Student student : list) {
                student.display();
            }
        }
    }

    private static List<Student> getData() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Student> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (file.length() == 0) {
            System.out.println("No data!");
        } else {
            try {
                fis = new FileInputStream(path);
                ois = new ObjectInputStream(fis);
                list = (List<Student>) ois.readObject();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

}
