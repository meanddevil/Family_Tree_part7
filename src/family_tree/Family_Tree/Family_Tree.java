package family_tree.Family_Tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import family_tree.Human.Human;
import family_tree.Human.Comparator.HumanComparatorByDob;
import family_tree.Human.Comparator.HumanComparatorByName;
import family_tree.Human.Comparator.HumanComparatorByPlaceOfBirth;

import java.util.Iterator;
/* 
 * Класс для описания генеалогического древа
 */
public class Family_Tree implements Serializable, Iterable<Human>{

    private List<Human> humanList;

    public Family_Tree() 
    {
         this(new ArrayList<>());
    }

    public Family_Tree(List<Human> humanList) 
    { 
        this.humanList = humanList; 
    }

    /*
     * Добавляет нового члена в древо
     */
    public boolean add(Human human)
    {
        if (human == null) return false;
        if (!humanList.contains(human))
        {
            humanList.add(human);
            if (human.getFather() != null) human.getFather().addChilde(human);
            if (human.getMother() != null) human.getMother().addChilde(human);
            if (human.getSpousa() != null) human.getSpousa();
            if (human.getSpouse() != null) human.getSpouse();
            return true;
        }
        else return false;
    }

    
/*
 * метод позволяющий найти отдельного человека в древе
 */
    public Human getByName(String name)
    {
        for (Human human: humanList)
        {
            if (human.getName().equals(name)) return human;
        }
        return null;
    }
/*
 * Вывод всех членов древа
 */
    public String getData()
    {
        StringBuilder info = new StringBuilder();
        info.append("В генеалогическим дереве: ");
        info.append(humanList.size());
        info.append(" объектов. \n");
        int i =1;
        for (Human human: humanList)
        {   
            info.append(i);
            info.append('.');
            info.append(' ');
            info.append(human.getData());
            info.append("\n");
            i++;
        }
        return info.toString();
    }

    public void sortByName(){humanList.sort(new HumanComparatorByName());}

    public void sortByDob(){humanList.sort(new HumanComparatorByDob());}

    public void sortByPlaceOfBirth(){humanList.sort(new HumanComparatorByPlaceOfBirth());}

    @Override
    public Iterator<Human> iterator() {
        return new Family_TreeIterator(humanList);
    } 
}
