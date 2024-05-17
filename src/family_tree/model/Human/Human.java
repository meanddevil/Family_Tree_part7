package family_tree.model.Human;

import java.time.LocalDate;


import family_tree.model.Family_Tree.*;

import java.io.Serializable;
import java.lang.String;

/**
 * Класс для описания отдельного человека
 */

public class Human implements Serializable, Node<Human>{
    private String name;
    private LocalDate dob;
    private Gender gender;
    private String mother,father;
    private String spousa, spouse;
    private StringBuilder children;
    private String placeOfBirth;
    

    /*
    * @param name - имя человека
    * @param dob, dod - дата рождения и дата смерти
    * @param gender - пол
    * @param children - список детей
    * @param mother,father - связь родителя и ребенка
    * @param  spousa, spouse - наличие супруга/супруги
    * @param placeOfBirth - место рождения
    */

    public Human(String name2, Gender gender2, String placeOfBirth2, LocalDate dob2, String father, String mother,String spousa2, String spouse2, StringBuilder children) {
        this.name = name2;
        this.gender = gender2;
        this.dob = dob2;
        this.placeOfBirth = placeOfBirth2;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse2;
        this.spousa = spousa2; 
        this.children = children;
    }


 /*
  * getter and setter
  */
    public String getName()         { return name;      }
    public Gender getGender()       { return gender;    }
    public LocalDate getDateBirth()      { return dob; }
    public String  getPlaceOfBirth()        { return placeOfBirth;  }
    public String  getFather()        { return father;    }
    public String  getMother()        { return mother;    }
    public StringBuilder getChildren(){ return children;  }
    public String  getSpouse()        { return spouse;    }
    public String  getSpousa()        { return spousa;    }
  

    public void setName(String name)                { this.name = name; }
    public void setGender(Gender gender)            { this.gender = gender; }
    public void setDateBirth(LocalDate dob)        { this.dob = dob; }
    public void setFatherr(String  father) { this.father = father; }
    public void setMother(String  mother) { this.mother = mother; }
    public void setSpouse (String  spouse) { this.spouse =  spouse; }
    public void setSpousa (String  spousa) { this.spousa =  spousa; }
    public void setPlaceOfBirth (String placeOfBirth)  { this.placeOfBirth = placeOfBirth; }

    public String getData() {
        return new DataFormat(this).formatData();
    }

    public String getMotherInfo(){
        return getMotherInfo();
    }
    public String getFatherInfo(){
        return getFatherInfo();
    }

     public String getSpousaInfo() 
    {
        return getSpousaInfo();
    }

    public String getSpouseInfo() 
    {
        return getSpouseInfo();
    }
    public String getChildrenInfo() 
    {
        return getChildrenInfo();
    }
   
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (!(obj instanceof Human)) return false;
        Human human = (Human) obj;
     return human.getName().equals(getName());
    }
   
   
}
