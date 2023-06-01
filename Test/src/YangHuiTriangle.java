import java.util.Scanner;

/**
 * @author Robin
 * @date 2023/5/27
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入要打印的行数：");
        int n = in.nextInt();
        printYHTriangle(n);
    }

    public static void printYHTriangle(int n){
        int[][] triangle = new int[n][n];

        for(int i=0;i<n;i++)
        {
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for(int j=1;j<i;j++)
            {
                triangle[i][j] = triangle[i-1][j-1]+triangle[i-1][j];
            }
        }

        //打印
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
