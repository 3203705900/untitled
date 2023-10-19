package 异常处理;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            saveAge(16);
            System.out.println("底层执行成功了！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }
        try {
            saveAge2(25);
            System.out.println("底层执行成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }


    }

    public static void saveAge(int age) {
        if (age > 0 && age < 100) {
            System.out.println("年龄保存成功" + age);
        } else {
            //用一个异常对象封装这个问题
            //throw抛出这个异常对象
            //throws用在方法上，抛出方法内部的异常
            throw new AgeIllegalRuntimeException("/age is illegal,your age is" + "  " + age);
        }

    }
    public static void saveAge2(int age) throws AgeIllegalException{
        if (age > 0 && age < 100) {
            System.out.println("年龄保存成功" + age);
        } else {
            //用一个异常对象封装这个问题
            //throw抛出这个异常对象
            //throws用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("/age is illegal,your age is" + "  " + age);
        }
    }
}

