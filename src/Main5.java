void main()
{
    Rab pri = new Rab(1, 2, 3);
    System.out.println(pri.first() + " " + pri.second() + " " + pri.third());
}


class Rab
{
    int x;
    int a;
    int b;

    Rab(int x, int a, int b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    int first(){
        return 3*x+5;
    }

    int second(){
        if (a - b != 0) {
            return (a + b) / (a - b);
        } else {
            return 0;
        }
    }

    int third(){
        if (b != 0) {
            int y = ((a * x) / b);
            int result = 1;
            for (int i = 1; i <= y; i++) {
                result = result * i;
            }
            return result;
        } else {
            return 0;
        }
    }
}
