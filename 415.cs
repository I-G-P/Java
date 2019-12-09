using System;

namespace CS
{
    class Program
    {
        static void Main(string[] args)
        {
            // (415.2)
            int n = int.Parse(Console.ReadLine());
        
            String a = Console.ReadLine();
            int[] arrA = FillArr(a);

            String b = Console.ReadLine();            
            int[] arrB = FillArr(b); 

            String c = Console.ReadLine();
            int[] arrC = FillArr(c);   

            // create product  and safe it in array (415.2)
            int[] productsArr = new int[3];
            productsArr[0] = ProductOfMultiplication(arrA);     
            productsArr[1] = ProductOfMultiplication(arrB);      
            productsArr[3] = ProductOfMultiplication(arrC);    
            //finde  smalest product(415.2)
            int minint = productsArr [0];
            foreach (int value in productsArr) 
            {
                 if(value < minint) minint = value;
            }

            Console.WriteLine(minint);

            // change array C (415.3)
            int[] newArrC = new int[arrC.Length];
             for (int i = 0; i < newArrC.Length; i++)
            {
                newArrC[i] = arrC[1]*arrB[(arrB.Length-1)-i];
            }
            //print new C
            foreach(var item in newArrC)
            {
                Console.WriteLine(item.ToString());
            }
        }
        //415.1
        static int[] FillArr (String inputLine)   // a
        {
            string[] items = inputLine.Split();
            int[] arr = new int[items.Length];

            for (int i = 0; i < items.Length; i++)
            {
            arr[i] = int.Parse(items[i]);
            }
            return arr;
        }
        static int 	ProductOfMultiplication(int[]arr)   // b
        {
            int product=1;
            foreach (int item in arr)
            {
                if(item>0 && item<=50)
                {
                    if(item%3==0)
                    {
                        product*=item;
                    }
                }
            }
            return product;
        }
    }
}
