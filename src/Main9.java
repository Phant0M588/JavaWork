void main() {
    Scanner in = new Scanner(System.in);
    Student[] st = new Student[3];
    for(int i = 0; i < st.length; i++)
    {
        st[i].FIO = in.nextLine();
        st[i].data = in.nextInt();
        st[i].adres = in.nextLine();
        st[i].kurs = in.nextInt();
        st[i].fakul = in.nextLine();


    }

    for(int i = 0; i < st.length; i++){
        System.out.print(st[i].FIO + " ");
    }
    System.out.println();

    String fakuli = in.nextLine();
    for(int i = 0; i < st.length; i++){
        if(st[i].fakul == fakuli){
            System.out.print(st[i].FIO + " ");
        }
    }
    System.out.println();

    int goda = in.nextInt();
    for(int i = 0; i < st.length; i++){
        if(st[i].data > goda){
            System.out.print(st[i].FIO + " ");
        }
    }
}

class Student{
    private  String FIO;
    private int data;
    private String adres;
    private int number;
    private int kurs;
    private String fakul;

    Student(String FIO, int data, String adres, int kurs, String fakul){
        this.FIO = FIO;
        this.data = data;
        this.adres = adres;
        this.kurs = kurs;
        this.fakul = fakul;
    }

    String getFIO(){return this.FIO;}
    void setFIO(String FIO){this.FIO = FIO;}
    void setdata(int data){this.data = data;}
    String getAdres(){return this.adres;}
    int getNumber(){return this.number;}
    void setNumber(int number){this.number = number;}
    void setKurs(int kurs){this.kurs = kurs;}
    String getFakul(){return this.fakul;}
}

// Разработать класс для объекта Student с private полями
// ФИО(чтение и запись), дата поступления(запись), Адрес(чтение), Телефон(чтение и запись), Курс(запись), Факультет(чтение).
// Создать массив из трех объектов. Вывести: а) ФИО всех студентов б) список студентов заданного факультета; в) список студентов, поступивших после заданного года.