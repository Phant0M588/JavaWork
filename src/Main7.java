void main()
{
    Scanner in = new Scanner(System.in);

    Rabot[]  lud = new Rabot[4];
    lud[0] = new Rabot("Слепов И.И.", "Сварщик", 2012, 80000);
    lud[1] = new Rabot("Пугачёв А.Б.", "Токарь", 1993, 130000);
    lud[2] = new Rabot("Петров В.О.", "Эдектрик", 2021, 50000);
    lud[3] = new Rabot("Грачёв Д.Я.", "Токарь", 1991, 100000);
    int ZP = in.nextInt();
    for (int i = 0; i < lud.length; i++ )
    {
        if(ZP < lud[i].zp)
        {
            System.out.println(lud[i].name);
        }
    }
    String dolg = in.next();
    for (int i = 0; i < lud.length; i++ )
    {
        if(dolg == lud[i].rab)
        {
            System.out.println(lud[i].name);
        }
    }
}

class Rabot
{
    String name, rab;
    int got, zp;
    Rabot(String name, String rab, int got, int zp)
    {
        this.name = name;
        this.rab = rab;
        this.got = got;
        this.zp = zp;
    }


}