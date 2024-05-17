package family_tree.model.Service;

import java.time.LocalDate;

import family_tree.model.Family_Tree.Family_Tree;
import family_tree.model.Human.Gender;
import family_tree.model.Human.Human;
import family_tree.model.Serializable.FileHandler;

public class Service {
    private Family_Tree<Human> family_Tree;

    private FileHandler fileHandler;
    private String file = "src/family_tree/tree.txt";

    public Service(){
        family_Tree = new Family_Tree<>();
        fileHandler = new FileHandler();

        family_Tree = (Family_Tree) fileHandler.read(file);
    }

    public void add(String name, Gender gender, String placeOfBirth, LocalDate dob, String father, String mother, String spousa, String spouse, StringBuilder chidren){
        Human human = new Human(name, gender, placeOfBirth, dob, father, mother, spousa, spouse, chidren);
        family_Tree.add(human);

        fileHandler.save(family_Tree, file);
    }

    public String getData()
    {
        StringBuilder infostring = new StringBuilder();
        infostring.append("В генеалогическим дереве: \n");
       
        for (Human human: family_Tree){
            infostring.append(human.getData());
            infostring.append("\n");
        }
        return infostring.toString();
    }


    public void sortByName(){
        family_Tree.sortByName();
    }

    public void sortByDob(){
        family_Tree.sortByDob();
    }

    public void sortByPlaceOfBirth(){
        family_Tree.sortByPlaceOfBirth();
    }
}
