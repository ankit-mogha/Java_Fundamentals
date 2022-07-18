public class PalindromeWithMinimumChange {
    public static void stringPalindromeWithMinimumChange(String str) {
        int length = str.length();
        int counterCount = 0;
        for(int index = 0; index < length/2; index++)
        {
            if(str.charAt(index) == str.charAt(length - index - 1))
                continue;
            counterCount += 1;
            if(str.charAt(index) < str.charAt(length - index - 1))
                str = str.replace(str.charAt(length - index - 1),str.charAt(index));
            else
                str = str.replace(str.charAt(length-1),str.charAt(length - index - 1));
        }
        System.out.println("Minimum characters to be replaced = "+(counterCount)) ;
        System.out.println("String after character replaced = " +str);
    }
}
