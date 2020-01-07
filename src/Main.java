public class Main
{

    public static void main(String[] args)
    {
        int[][] table = new int[10][6];

        for(int row = 0; row <10; row++)
            for(int column = 0; column <6; column++)
                table[row][column] = getBalance(1000.00, row+1, (5 + 0.5*column));


        for(int row = 0; row<10; row++)
        {
            System.out.print((row+1) + " ");
            for(int column = 0; column <6; column++)
            {
                System.out.print("$" + table[row][column] + " ");

            }
            System.out.println();

        }


    }
    public static int getBalance(double balance, int years, double rate)
    {
        double runningBalance = balance;
        for(int count = 1; count <= years; count++)
            runningBalance = runningBalance * (1 + rate/100);
        return (int)(Math.round(runningBalance));
    }
}
