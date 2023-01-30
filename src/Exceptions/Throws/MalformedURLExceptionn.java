package Exceptions.Throws;

import java.net.URL;
import java.net.MalformedURLException;

public class MalformedURLExceptionn {

    public static void main(String[] args) throws MalformedURLException {
        System.out.println(convertStringToUrl("http://ya.ru"));
    }

    public static URL convertStringToUrl(final String input)
           throws MalformedURLException{
               if (input == null){
                   throw new MalformedURLException();
               }

        return new URL(input);
    }
}