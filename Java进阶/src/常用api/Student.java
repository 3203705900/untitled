package 常用api;

import java.util.Objects;

public   class Student     {
    private String name;
    private int age;
    public Student(){
        System.out.println("ss");

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写equals方法，比较两个对象的内容一样就返回true


    @Override
    //比较者  s2=this
    // 呗比较者  s1=0
    public boolean equals(Object o) {
        //1.判断两个对象地址是否一样，一样返回true
        if (this == o) return true;
        //2.判断o是否为null 直接返回false，或者比较者和被比较者类型不一样，返回false
        if (o == null ||this. getClass() != o.getClass()) return false;
        //3.o不是null，且o一定是学生类型的对象。开始比较内容
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(this.name, student.name);
    }
    public  static void show(){

    }



}
