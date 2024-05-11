package family_tree.model.Human;

public class FamilyInfoProvider {
    private Human human;

    public FamilyInfoProvider(Human human) {
        this.human = human;
    }

    public String getFatherInfo() {
        String result = "";
        if (human.getFather() != null) {
            result += human.getFather();
        } else result += "информации нет";
        return result;
    }
    
    public String getMotherInfo() {
        String result = "";
        if (human.getMother() != null) {
            result += human.getMother();
        } else result += "информации нет";
        return result;
    }

    public String getSpouseInfo() {
        String res = "";
        if (human.getSpousa() != null) {
            res += "супруга " + human.getSpousa();
        } else res += "не женат";
        return res;
    }

    public String getSpousaInfo() {
        String res = "";
        if (human.getSpouse() != null) {
            res += "супруг " + human.getSpouse();
        } else res += "не жената";
        return res;
    }

    public String getChildrenInfo()
    {
        StringBuilder res = new StringBuilder();
        if (human.getChildren()!= null)
        {
            res = human.getChildren();
        }
        else res.append("детей нет");
        return res.toString();
    }
}
