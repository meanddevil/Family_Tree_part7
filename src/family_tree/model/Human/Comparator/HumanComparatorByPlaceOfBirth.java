package family_tree.model.Human.Comparator;

import java.util.Comparator;

import family_tree.model.Family_Tree.Node;

public class HumanComparatorByPlaceOfBirth<T extends Node<T>>  implements Comparator<T>{
    @Override
    public int compare(T o1,T o2){
        return o1. getPlaceOfBirth().compareTo(o2. getPlaceOfBirth());
    }
}
