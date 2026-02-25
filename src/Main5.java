void main()
{
    Rab pri1 = new Rab();
    Rab pri2 = new Rab();
    Rab pri3 = new Rab();

    Scanner in = new Scanner (System.in);
    pri1.x = in.nextInt();
    pri1.y = ((3* pri1.x)+5);

    pri2.a = in.nextInt();
    pri2.b = in.nextInt();
    pri2.y = ((pri2.a + pri2.b)/(pri2.a - pri2.b));

    pri3.x = in.nextInt();
    pri3.a = in.nextInt();
    pri3.b = in.nextInt();
    pri3.y = ((pri3.a * pri3.x) / pri3.b);
    int result = 1;
    for (int i = 1; i <= pri3.y; i++)
    {
        result = result * i;
    }
    pri3.y = result;
    System.out.println(pri1.y + " " + pri2.y + " " + pri3.y);
}
class Rab
{
    int x;
    int a;
    int b;
    int y;
}

//1) y=3x+5
//2) y=(a+b)/(a-b)
//3) y=(ax/b)!