package family_tree.model.Human;

import java.time.LocalDate;
import java.util.*;

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

    public Human (String name, Gender gender, LocalDate dob , String father, String mother, String placeOfBirth, String spouse, String spousa, StringBuilder children)
    {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.spousa = spousa; 
        this.placeOfBirth = placeOfBirth;
        this.children = children;
    }


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


    // public boolean addChilde(Human child) 
    // { 
    //     if (!children.contains(child))
    //     { 
    //         children.add(child); 
    //         return true;
    //     }
    //     return false;
    // }


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


    /*
     *  Вывод информации по человеку
     */
    public String getData()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: ");         sb.append(name);            sb.append("; ");
        sb.append("Пол: ");                  sb.append(gender);          sb.append("; ");
        sb.append("Дата рождения: ");        sb.append(dob);       sb.append("; ");
        sb.append("Место рождения: ");        sb.append(placeOfBirth);       sb.append("; ");
        sb.append("Отец : ");                sb.append(getFatherInfo());   sb.append("; ");
        sb.append("Мать : ");                sb.append(getMotherInfo());   sb.append("; ");
        sb.append("Дети : ");    sb.append(getChildrenInfo()); sb.append(". ");
        if(gender == Gender.FEMALE )
        {
            sb.append("Семейное положение : ");    sb.append(getSpousaInfo()); sb.append(". ");
        } 
        else
        {
            sb.append("Семейное положение : ");    sb.append(getSpouseInfo() ); sb.append(". ");
        }

        return sb.toString();
    }

    /*
     * Информация о родителях
     */
    public String getFatherInfo() 
    {
        String result = "";
        if (father != null) {result += father;}
        else result += "информации нет";
        return result;
    }

    public String getMotherInfo() 
    {
        String result = "";
        if (mother != null){result += mother;}
        else result += "информации нет";
        return result;
    }

    /*
     * Информация о детях
     */
    public String getChildrenInfo()
    {
        StringBuilder res = new StringBuilder();
        if (children != null)
        {
            res = children;
        }
        else res.append("детей нет");
        return res.toString();
    }

    /*
     * Информация о супругах
     */
    public String getSpouseInfo() 
    {
        String res = "";
        if (spousa != null){res += "супруга " + spousa;}
        else res += "не женат";
        return res;
    }

    public String getSpousaInfo() 
    {
        String res = "";
        if (spouse != null){res += "супруг " + spouse;}
        else res += "не жената";
        return res;
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
