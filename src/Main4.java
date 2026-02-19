void main()
{
    Scanner in = new Scanner (System.in);
    System.out.print("Введите размер массива: ");
    int q = in.nextInt();
    int[][] mass = new int [q][q];
    int[] mas = new int [q];
    for(int i = 0; i < q; i++)
    {
        for(int j = 0; j < q; j++)
        {
            System.out.printf("Введите целое число в клетку %dx%d: ", i+1, j+1);
            int w = in.nextInt();
            mass[i][j] = w;
        }
    }
    for(int i = 0; i < q; i++)
    {
        mas[i] = mass[i][i];
    }
    int left = 0;
    int right = mas.length-1;
    while(left <= right)
    {
        for (int i = right; i > left; i--)
        {
            if(mas[i-1] > mas[i])
            {
                int temp = mas[i];
                mas[i] = mas[i - 1];
                mas[i - 1] = temp;
            }
        }
        left++;
        for (int i = left; i < right; i++)
        {
            if (mas[i] > mas[i+1])
            {
                int temp = mas[i + 1];
                mas[i + 1] = mas[i];
                mas[i] = temp;
            }
        }
        right--;
    }
    System.out.print("Порядок отсортированной диаганали: ");
    for(int i = 0; i < q; i++)
    {
        System.out.print(mas[i] + " ");
    }
}
