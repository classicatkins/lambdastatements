//Resources:
//https://www.w3schools.com/java/java_lambda.asp
//https://stackoverflow.com/questions/62411632/converting-a-method-to-lambda-expression

public class hw10
{
//main method
    public static void main(String []args) 
    {
        //1.
        //interface that stores the addone lambda
        interface Addone
        {
            public int addone (int n);
        }

        //lambda     //parameter//original code
        Addone addone  = (n) -> n + 1;

        //2.
        //interface that stores the addInts lambda
        interface Addints
        {
            public int addInts (int a, int b);
        }

        //lambda     //parameter//original code
        Addints addInts  = (a, b) -> a + b;

        //3.
        //interface that stores the reverse lambda
        interface Reverse
        {
            public int[] reverse (int[] list);
        }
        //lambda     //parameter

        Reverse reverse = (list) -> 
        {
            //original code
            int[] result = new int[list.length];
            for (int i = 0, j = result.length - 1; i < list.length; i++, j--) 
            {
                result[j] = list[i];
            }
            return result;
        };

        //4.
        //interface that stores the minFunction lambda
        interface Minfunction
        {
            public int minFunction (int n1, int n2);
        }

        //lambda                  //parameter
        Minfunction minFunction = (n1, n2) ->
        {
            //original code
            int min;
            if (n1 > n2)
            min = n2;
            else
            min = n1;
            return min;
        };

        //5.
        //interface that stores the count_Vowels lambda
        interface Countvowels
        {
            public int count_Vowels (String str);
        }

        //lambda                  //parameter
        Countvowels count_Vowels = (str) -> 
        {
            //original code
            int count = 0;
            for (int i = 0 ; i < str.length(); i++)
            {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
                str.charAt(i) == 'i'
                || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                {
                    count++;
                }
            }
            return count;
        };
    }
}