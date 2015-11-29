package org.azzyzt.ed.randomdata;

import java.util.ArrayList;
import java.util.List;

public class RandomDataGenerator {

    private static class ArgsProcessor {

       int requestedNumber;

       public boolean argumentsOk(String[] args) {
            if (args == null || args.length != 1) {
                return false;
            }
            String reqNumArg = args[0];
            try {
                requestedNumber = Integer.parseUnsignedInt(reqNumArg);
            }
            catch (NumberFormatException e) {
                System.err.println(reqNumArg + " is not an unsigned integer");
                return false;
            }
            return true;
        }


    }

    public static void main(String[] args) {
        ArgsProcessor a = new ArgsProcessor();
        if (!a.argumentsOk(args)) {
            return;
        }

        RandomDataGenerator rdg = new RandomDataGenerator();
        rdg.randomStrings(a.requestedNumber).forEach(System.out::println);
    }

    public RandomDataGenerator() {
        // TODO add some kind of initializations with tagged data sources
    }

    public List<String> randomStrings(int number) {
        List<String> res = new ArrayList<>();

        res.add("RANDOMNESS NOT YET IMPLEMENTED"); // TODO make this random and depend on number

        return res;
    }
}
