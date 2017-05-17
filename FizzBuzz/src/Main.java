public class Main {

    public static void main(String[] args) {

        // SOLUTION #1
        String test;
        for(int i = 1; i <= 100; i++){
            test = "";
            test += i%3==0 ? "Fizz" : "";
            test += i%5==0 ? "Buzz" : "";
            System.out.println(test.isEmpty() ? i : test);
        }


        // SOLUTION #2
        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz!");
            }
            else if(i%5 == 0){
                System.out.println("Buzz!");
            }
            else if(i%3 == 0 ){
                System.out.println("Fizz!");
            }
            else
                System.out.println(i);
        }

        // SOLUTION #3
        for(int i = 1; i <= 100; i++){
            System.out.println(i%3 == 0 ? (i%5 == 0 ? "FizzBuzz" : "Fizz") : (i%5 == 0 ? "Buzz" : Integer.toString(i)));
        }

    }
}
