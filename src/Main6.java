void main()
{
    Scanner in = new Scanner(System.in);
    Reader[] ch = new Reader[5];
    for(int i = 0; i < ch.length; i++)
    {
        ch[i].name = in.next();
        ch[i].bilet = in.nextInt();
        ch[i].facul = in.next();
        ch[i].data = in.next();
        ch[i].teleth = in.nextInt();

    }


    String Name[] = {ch[1].name, ch[2].name, ch[3].name, ch[4].name, ch[5].name};

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
    String name, facul, data;
    int bilet, teleth;
    Reader(String name, int bilet, String facul, String data, int teleth)
    {
        this.name = name;
        this.bilet = bilet;
        this.facul = facul;
        this.data = data;
        this.teleth = teleth;
    }

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