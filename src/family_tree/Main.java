package family_tree;

import family_tree.view.ConsoleUI;
import family_tree.view.View;
import family_tree.model.Serializable.FileHandler;
import family_tree.model.Service.Service;





public class Main {
  public static void main(String[] args) {

    View view = new ConsoleUI();
    view.start();

}
}