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
    for(int i = 0; i < q; i++) {
        mas[i] = mass[i][i];
    }
    for (int i = 0; i < q; i++)
    {
        int pos = i;
        int min = mas[i];
        for (int j = i+1; j < q; j++)
        {
            if(mas[j]<min){
                pos = j;
                min = mas[j];
            }
        }
        mas[pos] = mas[i];
        mas[i] = min;
    }
    System.out.print("Порядок отсортированной диаганали: ");
    for(int i = 0; i < q; i++)
    {
        System.out.print(mas[i] + " ");
    }
}