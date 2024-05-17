package family_tree;

import family_tree.view.ConsoleUI;
import family_tree.view.View;
import family_tree.model.Serializable.FileHandler;
import family_tree.model.Service.Service;





public class Main {
  public static void main(String[] args) {
      
    //  FileHandler fileHandler = new FileHandler();
    //  String file= "src/family_tree/tree.txt";
    //  Family_Tree<Human> family_tree = new Family_Tree<>();
    //  family_tree = (Family_Tree) fileHandler.read(file);
    //  fileHandler.save(family_tree, file);

    View view = new ConsoleUI();
    view.start();

}
}