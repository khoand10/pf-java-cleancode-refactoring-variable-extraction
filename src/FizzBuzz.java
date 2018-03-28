public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String fizzBuzz(int number){
        boolean result3True = number % 3 == 0;
        boolean result5True = number % 5 == 0;
        if(result3True && result5True)
            return FIZZ_BUZZ;
        if(result3True)
            return FIZZ;

        if(result5True)
            return FIZZ;

        return number + "";
    }
}
