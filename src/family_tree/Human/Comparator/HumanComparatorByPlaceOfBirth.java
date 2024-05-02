package family_tree.Human.Comparator;

import java.util.Comparator;

import family_tree.Family_Tree.Node;
//import family_tree.Human.Human;

public class HumanComparatorByPlaceOfBirth<T extends Node<T>>  implements Comparator<T>{
    @Override
    public int compare(T o1,T o2){
        return o1. getPlaceOfBirth().compareTo(o2. getPlaceOfBirth());
    }
}
