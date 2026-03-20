void main()
{
    System.out.println("Введите n");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println("Введите x");
    double x = scan.nextDouble();
    double v = 0;
    if(Math.abs(x) <= 1){
        for (int i = 0; i < n; i++)
        {
            v += (Math.pow(-1, i) * Math.pow(x,2*i+1) / (2*i+1));
        }
        System.out.print("Значение: " + v);
    }
    else{
        System.out.println("Ошибка! Значение х должно быть больше 0");
    }
}