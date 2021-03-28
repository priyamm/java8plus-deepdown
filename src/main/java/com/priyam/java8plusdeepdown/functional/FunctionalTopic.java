package com.priyam.java8plusdeepdown.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalTopic {

    /**
     *
     * 1. Functions
     * 2. Supplier
     * 3. Consumer
     *
     * 4. UnaryOperator
     * 5.BinaryOperator
     *
     */


    public static void main(String[] args) {
//        functionCode();
//        supplierCode();
        consumerCode();
    }

    private static void functionCode() {
        Function<Long, Long> adder = new AddThree();
        Long result = adder.apply((long) 4);
        System.out.println("result = " + result);
    }

    private static void supplierCode() {
        Predicate<Integer> ifEven = new IfEven();
        System.out.println("result = " + ifEven.test(2));
        System.out.println("result = " + ifEven.test(3));
    }

    private static void consumerCode() {
        Consumer<Integer> print = new Print();
        print.accept(2);

        // we can also use lambda expression
        Consumer<String> printString = (value) -> System.out.println(value);
        printString.accept("This is written using lambda expression.");
    }

}

/**
 * Function examples
 */
class AddThree implements Function<Long, Long> {

    @Override
    public Long apply(Long aLong) {
        return aLong + 3;
    }
}

/**
 * Supplier example
 */
class IfEven implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0)
            return true;
        return false;
    }
}

/**
 * Consumer example
 */
class Print implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
