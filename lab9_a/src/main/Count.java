package main;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Count {
    public int counterInt(String string){
        Pattern pattern = Pattern.compile("[^0-9]{1,}");
        Matcher matcher = pattern.matcher(string);
        String res = matcher.replaceAll(" ");
        OptionalInt m = Arrays.stream(res.split(" "))
                .mapToInt(String::length)
                .max();
        return m.getAsInt();
    }
}


