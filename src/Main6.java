void main()
{
    Reader ch1 = new Reader();
    Reader ch2 = new Reader();
    Reader ch3 = new Reader();
    Reader ch4 = new Reader();
    Reader ch5 = new Reader();

    Scanner in = new Scanner (System.in);
    ch1.name = in.next();
    ch1.bilet = in.nextInt();
    ch1.facul = in.next();
    ch1.data = in.next();
    ch1.teleth = in.nextInt();

    ch2.name = in.next();
    ch2.bilet = in.nextInt();
    ch2.facul = in.next();
    ch2.data = in.next();
    ch2.teleth = in.nextInt();

    ch3.name = in.next();
    ch3.bilet = in.nextInt();
    ch3.facul = in.next();
    ch3.data = in.next();
    ch3.teleth = in.nextInt();

    ch4.name = in.next();
    ch4.bilet = in.nextInt();
    ch4.facul = in.next();
    ch4.data = in.next();
    ch4.teleth = in.nextInt();

    ch5.name = in.next();
    ch5.bilet = in.nextInt();
    ch5.facul = in.next();
    ch5.data = in.next();
    ch5.teleth = in.nextInt();

    String Name[] = {ch1.name, ch2.name, ch3.name, ch4.name, ch5.name};

    for (int i = 0; i < 5; i++)
    {
        String Nname = Name[i];
        int kol = in.nextInt();
        TakeBook(kol, Nname);
        String[] Liberal = new String[kol];
        for (int j = 0; j < kol; j++)
        {
            Liberal[j] = in.next();
        }
        TakeBook(Liberal, Nname);
    }

    for (int i = 0; i < 5; i++)
    {
        String Nname = Name[i];
        int kol = in.nextInt();
        ReturnBook(kol, Nname);
        String[] Liberal = new String[kol];
        for (int j = 0; j < kol; j++)
        {
            Liberal[j] = in.next();
        }
        ReturnBook(Liberal, Nname);
    }
}






class Reader
{
    String name;
    int bilet;
    String facul;
    String data;
    int teleth;
}

void TakeBook(int kol, String Nname)
{
    System.out.printf("%s взял %d книги", Nname, kol);
}

void TakeBook(String[] Liberal, String Nname)
{
    System.out.printf("\n%s взял книги: ", Nname);
    for (int i = 0; i < Liberal.length; i++)
    {
        System.out.println(Liberal[i]);
        if (i < Liberal.length - 1) System.out.println(" , ");
    }
}

void ReturnBook(int kol, String Nname)
{
    System.out.printf("%s отдал %d книги", Nname, kol);
}

void ReturnBook(String[] Liberal, String Nname)
{
    System.out.printf("\n%s отдал книги: ", Nname);
    for (int i = 0; i < Liberal.length; i++)
    {
        System.out.println(Liberal[i]);
        if (i < Liberal.length - 1) System.out.println(" , ");
    }
}