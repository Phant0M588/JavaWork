void main()
{
    System.out.println("Введите n");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println("Введите x");
    double x = scan.nextDouble();
    double [] nn = new double [n];
    for (int i = 0; i < n; i++)
    {
        nn[i] = (Math.pow(-1, i) * Math.pow(x,2*i+1) / (2*i+1));
    }
    double v = 0;
    for (int i = 0; i < n; i++)
    {
        v+= nn[i];
    }
    System.out.println(v);
}
