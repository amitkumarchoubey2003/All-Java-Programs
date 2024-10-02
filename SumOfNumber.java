//Find sum of first n numbers


 class SumOfNumber
 {
       public static void main(String args[])
       {
              int sum = 0;
              int n=10;
              for(int i = 1;i <= n;i++)
              {
                        sum = sum + i;
              }
              System.out.println("The Sum Of "+n+" Numbers are:" + sum);
       }
 }
