package family_tree.model.Human;

/*
 *  Вывод информации по человеку
 */
public class DataFormat {
    private Human human;

    public DataFormat(Human human) {
        this.human = human;
    }

    public String formatData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: "); sb.append(human.getName()); sb.append("; ");
        sb.append("Пол: "); sb.append(human.getGender()); sb.append("; ");
        sb.append("Дата рождения: "); sb.append(human.getDateBirth()); sb.append("; ");
        sb.append("Место рождения: "); sb.append(human.getPlaceOfBirth()); sb.append("; ");
        sb.append("Отец : "); sb.append(getFatherInfo()); sb.append("; ");
        sb.append("Мать : "); sb.append(getMotherInfo()); sb.append("; ");
        sb.append("Дети : "); sb.append(getChildrenInfo()); sb.append(" ");
        if (human.getGender() == Gender.FEMALE) {
            sb.append("Семейное положение: "); sb.append(getSpousaInfo()); sb.append(". ");
        } else {
            sb.append("Семейное положение: "); sb.append(getSpouseInfo()); sb.append(". ");
        }

        return sb.toString();
    }
    private String getFatherInfo() {
        return new FamilyInfoProvider(human).getFatherInfo();
    }

    private String getMotherInfo() {
        return new FamilyInfoProvider(human).getMotherInfo();
    }

    private String getSpouseInfo() {
        return new FamilyInfoProvider(human).getSpouseInfo();
    }

    private String getSpousaInfo() {
        return new FamilyInfoProvider(human).getSpousaInfo();
    }

    private String getChildrenInfo() {
        return new FamilyInfoProvider(human).getChildrenInfo();
    }



}
