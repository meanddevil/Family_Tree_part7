package family_tree.model.Family_Tree;


import java.time.LocalDate;

public interface Node<T> {
   // boolean addChilde(String child) ;
    String getFather();
    String getMother();
    String getSpouse();
    String getSpousa();
    String getName();
    StringBuilder getChildren();
    String getPlaceOfBirth();
    LocalDate getDateBirth();
    String getData();
    String getFatherInfo(); 
    String getMotherInfo(); 
    String getChildrenInfo();
    String getSpousaInfo();
    String getSpouseInfo();
}
