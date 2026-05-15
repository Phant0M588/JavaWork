void main() {
    TT tv1 = new TT1("Человек", 1, 28);
    TT tv2 = new TT2("Банан", 5000, 0);
    TT tv3 = new TT3("Пули", 6, 19);
    PP ch1 = new PP1("Челоек", "1234");
    PP ch2 = new PP2("Phant0M", "Qw1234");
    PP ch3 = new PP3("Куст", "1234321");

    OBt N1 = new OBt("Сергей", "Помидор");

}

interface Tovar {
    void printT(String tovar);

    void printC(int cena);

    void printR(int reyting);
}

interface Polzovatel {
    void printL(String login);

    void printP(String parol);
}

class OBt implements Tovar, Polzovatel {
    String login, tovar;

    OBt(String login, String tovar) {
        this.login = login;
        this.tovar = tovar;
    }

    @Override
    public void printL(String login) {

    }

    @Override
    public void printP(String parol) {

    }

    @Override
    public void printT(String tovar) {

    }

    @Override
    public void printC(int cena) {

    }

    @Override
    public void printR(int reyting) {

    }
}

class TT implements Tovar {
    String tovar;
    int cena, reyting;

    TT(String tovar, int cena, int reyting) {
        this.tovar = tovar;
        this.cena = cena;
        this.reyting = reyting;
    }

    public void printT(String tovar) {

    }

    public void printC(int cena) {

    }

    public void printR(int reyting) {

    }
}

class TT1 extends TT {
    TT1(String tovar, int cena, int reyting) {
        super(tovar, cena, reyting);
    }
}

class TT2 extends TT {
    TT2(String tovar, int cena, int reyting) {
        super(tovar, cena, reyting);
    }
}

class TT3 extends TT {
    TT3(String tovar, int cena, int reyting) {
        super(tovar, cena, reyting);
    }
}

class PP implements Polzovatel {
    String login, parol;

    PP(String login, String parol) {
        this.login = login;
        this.parol = parol;
    }

    public void printL(String login) {

    }

    public void printP(String parol) {

    }
}

class PP1 extends PP {
    PP1(String login, String parol) {
        super(login, parol);
    }
}

class PP2 extends PP {
    PP2(String login, String parol) {
        super(login, parol);
    }
}

class PP3 extends PP {
    PP3(String login, String parol) {
        super(login, parol);
    }
}

//а) Создать интерфейс "Товар" с методами, работающие с названием товара, ценой, рейтингом. +
//б) Создать три класса, реализующие интерфейс "Товар" +
//в) Создать по одному экземпляру классов +
//г) Создать интерфейс "Пользователь"с методами, работающие с логином и паролем +
//д) Создать три класса реализующий интерфейс "Пользователь" и объект класса +
//е) Создать класс, реализующий одновременно интерфейс "Товар" и "Пользователь".
//      В этом классе создать метод выводящий сообщение, что такой-то пользователь купил такой-то товар.
//      Создать экземпляр этого класса.