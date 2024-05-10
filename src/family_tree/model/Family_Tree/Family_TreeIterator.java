package family_tree.model.Family_Tree;

import java.util.*;

//import family_tree.Human.Human;

public class Family_TreeIterator<T extends Node<T>>  implements Iterator<T>{
    private List<T> list;
    private int index;

    public Family_TreeIterator(List<T> list){
        this.list = list;
        index =0;
    }
/*
 * Проверяет, есть ли еще элементы
 */
     @Override
     public boolean hasNext(){
        return index < list.size();
    }
/*
 * Возвращает текущий элемент и переключается на следующий.
 */
     @Override
     public T next(){
        return list.get(index++);
     }
}
