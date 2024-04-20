package family_tree.Family_Tree;

import java.util.*;

import family_tree.Human.Human;

public class Family_TreeIterator implements Iterator<Human>{
    private List<Human> list;
    private int index;

    public Family_TreeIterator(List<Human> list){
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
     public Human next(){
        return list.get(index++);
     }
}
