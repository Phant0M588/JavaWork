void main()
{
    String name = "Артём", name2 = "Колобов", age = "20.02.2002",
            mark = "Lada",
            bookname = "Автопром", author = "Бычков";
    int carReal = 2001, vol = 20, bookReal = 1996;
    Chel per = new Chel(name, name2, age);
    Car car = new Car(mark, carReal, vol);

    Book book = new Book(bookname, author, bookReal);

    per.returnChel();
    car.returnCar();
    book.returnBook();
    per.takeAllClass(car,book);
}

class Chel
{
    String name, name2, birtDay;

    Chel(String name, String name2, String age)
    {
        this.name = name;
        this.name2 = name2;
        this.birtDay = age;
    }
    void returnChel()
    {
        System.out.println("Имя: " + name + "\tФамилия: " + name2 + "\tДата рождения: " + birtDay);
    }
    void takeAllClass(Car car, Book book)
    {
        System.out.println(this.name + " " + this.name2 + " читает книгу '"+ book.bookName + "' про машину " + car.mark);
    }
}
class Car
{
    String mark;
    int volume, yearRelease;
    Car(String mark, int yearRelease, int volume)
    {
        this.mark = mark;
        this.yearRelease = yearRelease;
        this.volume = volume;
    }
    void returnCar()
    {
        System.out.println("Марка: " + mark + "\tГод выпуска: " + yearRelease + "\tОбъем двигателя " + volume);
    }
}
class Book
{
    String bookName, author;
    int bookYearRelease;
    Book(String bookName, String author, int bookYearRelease)
    {
        this.author = author;
        this.bookName = bookName;
        this.bookYearRelease = bookYearRelease;
    }
    void returnBook()
    {
        System.out.println("Название книги: " + bookName + " \tАвтор: " + author + "\tГод выхода: "+ bookYearRelease);
    }
}