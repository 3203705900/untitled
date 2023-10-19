package 继承;

public class Teacher extends people {
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    public void printinfo(){
        System.out.println(getName()+"具备的能力为"+skill);
    }
    @Override//安全性可读性好
    public void print(){
        System.out.println("9999");
    }
}
