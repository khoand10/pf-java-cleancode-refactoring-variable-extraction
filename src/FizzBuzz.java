public class FizzBuzz {

    static final String FIZZBUZZ = "FizzBuzz";
    static final String FIZZ = "Fizz";

    public static String fizzBuzz(int number){
        boolean result3True = number % 3 == 0;
        boolean result5True = number % 5 == 0;
        if(result3True && result5True)
            return FIZZBUZZ;
        if(result3True)
            return FIZZ;

        if(result5True)
            return FIZZ;

        return number + "";
    }
}
