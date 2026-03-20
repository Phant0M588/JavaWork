void main()
{
    Rab pri = new Rab();
    Scanner in = new Scanner (System.in);
    pri.x = in.nextInt();
    pri.a = in.nextInt();
    pri.b = in.nextInt();
    System.out.println(pri.first() + " " + pri.second() + " " + pri.third());
}
class Rab
{
    int x;
    int a;
    int b;

    int first(){
        return 3*x+5;
    }

    int second(){
        return (a + b)/(a - b);
    }

    int third(){
        int y = ((a * x) / b);
        int result = 1;
        for (int i = 1; i <= y; i++)
        {
            result = result * i;
        }
        return result;
    }
}
