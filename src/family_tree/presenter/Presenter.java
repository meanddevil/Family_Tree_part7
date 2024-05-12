package family_tree.presenter;

import java.time.LocalDate;

import family_tree.model.Family_Tree.Family_Tree;
import family_tree.model.Human.Gender;
import family_tree.model.Human.Human;
//import family_tree.model.Human.Human;
import family_tree.view.View;

public class Presenter {
    private View view;
    private Family_Tree family_tree;

    public Presenter(View view){
        this.view = view;
        family_tree = new Family_Tree<>();
    }

    public void addnew(String name, Gender gender, String placeOfBirth, LocalDate dob, String father, String mother, String spousa, String spouse, StringBuilder chidren) {
        family_tree.add(new Human(name,gender,placeOfBirth,dob,father, mother, spousa, spouse, chidren));
        getData();
    }

    public void getData(){
        String answer = family_tree.getData();
        view.printAnswer(answer);
    }

    public void sortByName() {
        family_tree.sortByName();
        getData();
    }

    public void sortByDob() {
        family_tree.sortByDob();
        getData();    
    }

    public void sortByPlaceOfBirth() {
        family_tree.sortByPlaceOfBirth();
        getData(); 
    }

    // public void getByName(String str) {
    //     family_tree.getByName(str);
    // }

}
