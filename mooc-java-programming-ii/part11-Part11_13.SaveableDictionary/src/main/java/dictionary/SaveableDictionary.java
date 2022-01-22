package dictionary;

import javax.swing.*;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SaveableDictionary {
    private String file;
    private PrintWriter printWriter;
    private Scanner fileReader;
    private HashMap<String,String> dictionary = new HashMap<>();

    public SaveableDictionary() {}

   public SaveableDictionary(String file) {
       this.file = file;
   }

   public boolean load() {
       if (this.file == null)
           throw new IllegalArgumentException("File cannot be null");
       try {
           fileReader = new Scanner(Paths.get(this.file));
           while (fileReader.hasNextLine()) {
               String line = fileReader.nextLine();
               System.out.println(line);
               String[] parts = line.split(":");
               dictionary.put(parts[0],parts[1]);
           }
           fileReader.close();
           System.out.println(dictionary);
           return true;
       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
           return false;
       }
   }

   public boolean save() {
       if (this.file == null)
           throw new IllegalArgumentException("File cannot be null");
       try {
            printWriter = new PrintWriter(this.file);
           for (String key :
                   dictionary.keySet()) {
               printWriter.println(dictionary.get(key) + ":" + key);
           }
           printWriter.close();
            return true;
       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
           return false;
       }
   }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words))
            dictionary.put(words,translation);
    }

    public String translate(String word) {
        if (dictionary.containsKey(word))
            return dictionary.get(word);
        for (String key :
                dictionary.keySet()) {
            if (dictionary.get(key).equals(word))
                return key;
        }
        return null;
    }

    public void delete(String word) {
        dictionary.remove(word);
        dictionary.keySet().removeIf(o -> dictionary.get(o).equals(word));
    }
}
