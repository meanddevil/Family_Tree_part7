package family_tree;

import java.time.LocalDate;

import family_tree.Family_Tree.Family_Tree;
import family_tree.Human.Gender;
import family_tree.Human.Human;
import family_tree.Serializable.FileHandler;


public class Main {
    public static void main(String[] args) {
        
       FileHandler fileHandler = new FileHandler();
       String file= "src/family_tree/tree.txt";

        Family_Tree family_tree = new Family_Tree();
       
    
      //family_tree = (Family_Tree) fileHandler.read(file);
      

        family_tree.add(new Human("Павел", Gender.Male, LocalDate.of(1978, 11, 9), null, null, "Абакан",null,family_tree.getByName("Марина")));
        family_tree.add(new Human("Марина", Gender.Female, LocalDate.of(1978, 6, 13), null, null, "Чита",family_tree.getByName("Павел"),null));
        family_tree.add(new Human("Анастасия", Gender.Female, LocalDate.of(2002, 8, 22), family_tree.getByName("Павел"), family_tree.getByName("Марина"), "Чита",null,null));
        family_tree.add(new Human("Егор", Gender.Male, LocalDate.of(2006, 1, 15), family_tree.getByName("Павел"), family_tree.getByName("Марина"),  "Санкт-Петербург",null,null));

        System.out.println(family_tree.getData());

        fileHandler.save(family_tree, file);

        family_tree.sortByName();
        System.out.println(family_tree.getData());

        family_tree.sortByDob();
        System.out.println(family_tree.getData());
        
        family_tree.sortByPlaceOfBirth();
        System.out.println(family_tree.getData());
  
  }
}