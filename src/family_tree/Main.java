package family_tree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Family_Tree family_tree = new Family_Tree();

        family_tree.add(new Human("Павел", Gender.Male, LocalDate.of(1978, 11, 9), null, null, "Абакан",family_tree.getByName("Марина"),null));
        family_tree.add(new Human("Марина", Gender.Female, LocalDate.of(1978, 6, 13), null, null, "Чита",null, family_tree.getByName("Павел")));
        family_tree.add(new Human("Анастасия", Gender.Female, LocalDate.of(2002, 8, 22), family_tree.getByName("Павел"), family_tree.getByName("Марина"), "Чита",null,null));
        family_tree.add(new Human("Егор", Gender.Male, LocalDate.of(2006, 1, 15), family_tree.getByName("Павел"), family_tree.getByName("Марина"),  "Чита",null,null));

        System.out.println(family_tree.getData());

    }
}
