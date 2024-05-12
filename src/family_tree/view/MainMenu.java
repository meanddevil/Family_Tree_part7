package family_tree.view;

import java.util.ArrayList;
import java.util.List;

import family_tree.view.Command.Addnew;
import family_tree.view.Command.Command;
import family_tree.view.Command.Finish;
import family_tree.view.Command.GetData;
import family_tree.view.Command.SortByDod;
import family_tree.view.Command.SortByName;
import family_tree.view.Command.SortByPlaceOfBirth;

public class MainMenu {
    private List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new  ArrayList<>();
        commands.add(new Addnew(consoleUI));
        commands.add(new SortByDod(consoleUI));
        commands.add(new SortByName(consoleUI));
        commands.add(new SortByPlaceOfBirth(consoleUI));
        commands.add(new GetData(consoleUI));
        commands.add(new Finish(consoleUI));
        
    }

    
    public String getMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
    public void execute(int choice){
        Command command = commands.get(choice -1);
        command.execute();
    }
}
