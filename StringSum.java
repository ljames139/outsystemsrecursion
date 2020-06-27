package Outsystems;

public class StringSum {

    public static void main(String [] args){

        /*
        Both methods called with string of integers adding to 12
        and mixed characters
         */

        String input = "2aAa4To6a=s-Tz";
        System.out.println(sumWithALoop(input));
        System.out.println(recursiveSumFunction(input));

        /*
        Both methods called with plain text string - output 0.
         */
        String justText = "this is just text";
        System.out.println(sumWithALoop(justText));
        System.out.println(recursiveSumFunction(justText));


    }

    /*
    Simple method with for loop that sums the integers
    in a string and returns their sum as an int
     */

    public static int sumWithALoop(String input){
        int output = 0;

        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                output += Character.getNumericValue(input.charAt(i));
            }
        }

        return output;
    }


    /*
    method using recursion instead of a loop to sum the integers in a string.
    The method tests to see if the character at index 0 in the string is
    an integer or not.

    If the character is not an integer, the element at position 0 is removed using
    substring method and the remaining string minus the initial element are passed
    as a parameter as the method is recalled.

    If an integer is at position 0 in the string,
    the integer is stored in temp, then the element is
    removed using the substring method. The temp containing
    the integer is then added to the recursive method call and
    the string minus the element at index 0 is passed in.

    When the string is 0, 0 is returned, breaking the recursive chain.
     */

    public static int recursiveSumFunction(String input){

        if(input.length() == 0){
            return 0;
        }

        else if(!Character.isDigit(input.charAt(0))){
            String str = input.substring(1);
            return recursiveSumFunction(str);
        } else if(Character.isDigit(input.charAt(0))){
            int temp = Character.getNumericValue(input.charAt(0));
            String str = input.substring(1);

            return temp + recursiveSumFunction(str);
        }

        return 0;

    }

}
