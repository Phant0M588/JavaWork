void main() {
    Scanner in = new Scanner(System.in);
    Person[] st = new Student[]{
            new Student("Хлебушек Андрей Викторович", 23, "89344553456", 3, "Слизерин", 2023),
            new Student("Печенегов Олег Дмитриевич", 12, "89273802936", 4, "Грифендор", 2022),
            new Student("Всеволодов Даниил Олегович", 45, "89374503636", 1, "Грифендор", 2025)
    };
    for(Student s : (Student[]) st){
        System.out.println(s.fio + " " + s.getAge());
    }

    System.out.println();
    String ff = in.next();
    for(Student s : (Student[]) st){
        if (Objects.equals(ff, s.fakul)){
            System.out.println(s.fio);
        }
    }

    System.out.println();

    int dd = in.nextInt();
    for(Student s : (Student[]) st){
        if(dd < s.getData()){
            System.out.println(s.fio);
        }
    }
}

class Person{
    private int age;
    public String fio;
    public String number;
    Person(String fio, int age,  String number){
        this.age = age;
        this.fio = fio;
        this.number = number;
    }

    public int getAge(){
        return age;
    }
}

class Student extends Person{
    public int kurs;
    public String fakul;
    private int data;
    Student(String fio, int age, String number, int kurs, String fakul, int data){
        super(fio, age, number);
        this.kurs = kurs;
        this.fakul = fakul;
        this.data = data;
    }
    public int getData(){
        return  data;
    }
}

// Создать класс Person с private полем возраст и public полями ФИО, Телефон.
// Создать класс-наследник Student с дополнительными public полями - Курс, Факультет и private полем дата поступления.
// Создать массив из трех объектов класса Student.
// Вывести:
// а) ФИО и возраст всех студентов
// б) список студентов заданного факультета;
// в) список студентов, поступивших после заданного года.