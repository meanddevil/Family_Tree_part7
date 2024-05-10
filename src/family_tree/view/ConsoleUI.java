package family_tree.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import family_tree.model.Human.Gender;
import family_tree.model.Human.Human;
import family_tree.presenter.Presenter;

public class ConsoleUI<Human> implements View{

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
    }


    @Override
    public void start() {
        System.out.println("Добрый день! Выберите действие:");
        while(work){
            System.out.println("1. Добавить члена");
            System.out.println("2. Получить список членов семьи");
            System.out.println("3. Сортировка по алфавиту");
            System.out.println("4. Сортировка по дате рождения");
            System.out.println("5. Сортировка по месту рождения ");
            System.out.println("6. Закончить работу");
            String choice =scanner.nextLine();
            switch (choice) {
                case "1":
                    addnew();
                    break;

                case "2":
                    getData();
                    break;
                case "3":
                    sortByName();
                    break;
                case "4":
                    sortByDob();
                    break;
                case "5":
                    sortByPlaceOfBirth();
                    break;
                case "6":
                    finish();
                    break;
                default:
                    error();
                    break;
            }
        }
    }

    private void addnew(){
        System.out.println("Укажите имя");
        String name = scanner.nextLine();
        System.out.println("Укажите пол: Male/Female");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Укажите место рождения");
        String placeOfBirth = scanner.nextLine();
        System.out.println("Укажите дату рождения в формате:год.месяц.день");
        String strdob = scanner.nextLine();
        LocalDate dob = LocalDate.parse(strdob, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        

//      System.out.println("Введите количество детей: 0/1/...");
//      String numofchil = scanner.nextLine();
//         if (numofchil.equals("0")) {
//             String chidren = null;
//         } else {
//                 ArrayList<String> chidren = new ArrayList<>(); 
//                 for (int i = 1; i <= Integer.parseInt(numofchil); i++) { // numofchil в int с помощью Integer.parseInt()
//                     System.out.println("Введите имя ребенка:");
//                     chidren.add(scanner.nextLine()); 
//     }
// }
    
        presenter.addnew(name,gender,placeOfBirth,dob);
    }

    private void sortByDob() {
        presenter.sortByDob();
    }

    private void sortByPlaceOfBirth(){
        presenter.sortByPlaceOfBirth();
    }           

    private void sortByName() {
        presenter.sortByName();
    }

    private void getData() {
        presenter.getData();    
    }


    private void error() {
        System.out.println("Введено неверное значение");
    }


    private void finish() {
        System.out.println("Досвидания!");
        work = false;
    }


    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

}
