void main() {
    Reader libery = new Reader("FF.", "312", "ВАА", "25.12.2001", "8992543151");

    libery.takeBook(5);
    libery.takeBook("Новая литература", "Словарь", "Пересказы", "Конспекты", "История");
    libery.returnBook(2);
    libery.returnBook("Пересказы", "Словарь");
}

class Reader {
    String name, number, facultet, data, phoneNumber;

    Reader(String name, String number, String facultet, String data, String phoneNumber) {
        this.name = name;
        this.data = data;
        this.number = number;
        this.facultet = facultet;
        this.phoneNumber = phoneNumber;
    }

    void takeBook(int countBook) {
        System.out.printf("%s взял %d книги ", name, countBook);
        System.out.println();
    }

    void takeBook(String... book) {
        System.out.printf("%s взял книги: ", name);
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i] + " ");
        }
        System.out.println();
    }

    void returnBook(int countBook) {
        System.out.printf("%s вернул %d книги ", name, countBook);
    }

    void returnBook(String... book) {
        System.out.printf("\n%s отдал книги: ", name);
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i] + " ");

        }
        System.out.println();
    }
}
