public class ReadNum
{
    static String[] say_what_you_see(String[] input_strings) {
        // Input: ["12", "21"]
        // Output: 1112
        //         1211

        for (int i = 0; i < input_strings.length; i++)
        {
            String[] numbers = (input_strings[i]).split("");
            for (int k = 0; k < numbers.length; k++)
            {
            System.out.println(numbers[k]);
            }
            // initialized temp to a 2-digit number
            int temp = 10;
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < numbers.length; j++)
            {
                System.out.println(sb.toString());
                if(numbers.length-1 == j)
                {
                    if (temp != Integer.parseInt(numbers[j]))
                    {
                        sb.append(1);
                        sb.append(numbers[j]);
                    }
                    else
                    {
                        sb.append(count+1);
                        sb.append(temp);
                    }
                }

                if (count == 0)
                {
                    temp = Integer.parseInt(numbers[j]);
                    count ++;
                }

                else
                {
                    if (temp != Integer.parseInt(numbers[j]))
                    {
                        sb.append(count);
                        sb.append(temp);
                        count = 1;
                        temp = Integer.parseInt(numbers[j]);
                    }
                    else
                    {
                        count++;
                        temp = Integer.parseInt(numbers[j]);
                    }
                }
            }
            input_strings[i] = sb.toString();
        }
        return input_strings;
    }

    public static void main(String[] args)
    {
        String[] test = {"121110", "01001", "555"};

        for (int i = 0; i < test.length; i++)
        {
            System.out.println(test[i]);
        }
        System.out.println();

        String[] result = say_what_you_see(test);

        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}