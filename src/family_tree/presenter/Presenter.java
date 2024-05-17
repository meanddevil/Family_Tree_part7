package family_tree.presenter;

import java.time.LocalDate;
import family_tree.model.Human.Gender;
import family_tree.model.Service.Service;

import family_tree.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view){
        this.view = view;
        service = new Service();
    }

    public void add(String name, Gender gender, String placeOfBirth, LocalDate dob, String father, String mother, String spousa, String spouse, StringBuilder chidren) {
        service.add(name,gender,placeOfBirth,dob,father, mother, spousa, spouse, chidren);
        getData();
    }

    public void getData(){
        String answer = service.getData();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByName();
        getData();
    }

    public void sortByDob() {
        service.sortByDob();
        getData();    
    }

    public void sortByPlaceOfBirth() {
        service.sortByPlaceOfBirth();
        getData(); 
    }

}
