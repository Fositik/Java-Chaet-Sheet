package FunctionalProgramming;

public class FunctionalInterface {
    interface Function<T1,T2,R>{
        R apply(T1 arg1,T2 arg2);
    }

    public static void main(String[] args) {
        /**
         *Integer::sum == (arg1, arg2) -> arg1+arg2
         */
        Function<Integer,Integer,Integer> function = Integer::sum;
        System.out.println(function.apply(3,7));
    }
}
