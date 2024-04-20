package family_tree.Human.Comparator;

import java.util.Comparator;

import family_tree.Human.Human;

public class HumanComparatorByPlaceOfBirth implements Comparator<Human>{
    @Override
    public int compare(Human o1,Human o2){
        return o1. getPlaceOfBirth().compareTo(o2. getPlaceOfBirth());
    }
}
