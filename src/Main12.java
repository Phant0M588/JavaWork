void main() {
    User us1 = new Student("Иван", 22, "Староста");
    User us2 = new Teacher("Лёха", 45, "Учитель истроиии");
    us1.printL("newLogin");
    us2.printP("qwerty12345");
}

interface User {
    void printL(String login);

    void printP(String password);
}

abstract class People implements User {
    String name, dolg;
    int age;

    People(String name, int age, String dolg) {
        this.name = name;
        this.age = age;
        this.dolg = dolg;
    }
}

class Teacher extends People {
    Teacher(String name, int age, String dolg) {
        super(name, age, dolg);
    }

    public void printL(String login) {
        System.out.println("Login for Teacher - " + login);
    }

    public void printP(String password) {
        System.out.println("Password for Teacher - " + password);
    }
}

class Student extends People {
    Student(String name, int age, String dolg) {
        super(name, age, dolg);
    }

    public void printL(String login) {
        System.out.println("Login for Student - " + login);
    }

    public void printP(String password) {
        System.out.println("Password for Student - " + password);
    }
}
// Создать интерфейс "Пользователь"с методами, работающие с логином и паролем.
// Создать абстрактный класс People, применяющий этот интерфейс, с полями "ФИО", "возраст", "должность".
// Создать два класса-наследника - "Преподаватель" и "Студент".
// Создать по два объекта данных классов.