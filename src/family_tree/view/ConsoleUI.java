package family_tree.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import family_tree.model.Human.Gender;
import family_tree.model.Human.Human;
import family_tree.presenter.Presenter;

public class ConsoleUI<Human> implements View{

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu mainMenu;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        mainMenu = new MainMenu(this);
    }


    @Override
    public void start() {
        System.out.println("Добрый день! Выберите действие:");
        while(work){
            System.out.println(mainMenu.getMenu());
            String strChoice = scanner.nextLine();
            int choice = Integer.parseInt(strChoice);
            mainMenu.execute(choice);
        }
    }

    public void addnew(){
        System.out.println("Укажите имя");
        String name = scanner.nextLine();
        System.out.println("Укажите пол: Male/Female");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Укажите место рождения");
        String placeOfBirth = scanner.nextLine();
        System.out.println("Укажите дату рождения в формате:год.месяц.день");
        String strdob = scanner.nextLine();
        LocalDate dob = LocalDate.parse(strdob, DateTimeFormatter.ofPattern("yyyy.MM.dd"));  
        System.out.println("Укажите имя отца");
        String father = scanner.nextLine();
        System.out.println("Укажите имя матери");
        String mother = scanner.nextLine();
        System.out.println("Состоит в браке? 0-да,1-нет");
        String YesNo = scanner.nextLine();
        String spousa;
        String spouse;
        if (YesNo.equals("0")) {
            spouse = null;
            spousa = null;
        } else {
            if (gender == gender.MALE){
                System.out.println("Введите имя супруги:");
                spousa = scanner.nextLine(); 
                spouse = null;
            }
            else{
                System.out.println("Введите имя супруга:");
                spouse = scanner.nextLine();
                spousa = null;
            }
        }
        System.out.println("Введите количество детей: 0/1/...");
        String NumOfChaild = scanner.nextLine();
        StringBuilder children = new StringBuilder(); 
        if (NumOfChaild.equals("0")) {
            children = null;
        } else {
            for (int i = 1; i <= Integer.parseInt(NumOfChaild); i++) { // numofchil в int с помощью Integer.parseInt()
                System.out.println("Введите имя ребенка:");
                children.append(scanner.nextLine());
                children.append(", "); 
            }
        }

        
        presenter.addnew(name, gender, placeOfBirth, dob, father, mother, spousa, spouse, children);
    }



    public void sortByDob() {
        presenter.sortByDob();
    }

    public void sortByPlaceOfBirth(){
        presenter.sortByPlaceOfBirth();
    }           

    public void sortByName() {
        presenter.sortByName();
    }

    public void getData() {
        presenter.getData();    
    }


    public void error() {
        System.out.println("Введено неверное значение");
    }


    public void finish() {
        System.out.println("Досвидания!");
        work = false;
    }


    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

}
