package com.main.interview;

public class ExceptionHandingdem {
    public static void main(String[] args) {
       /* try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }

        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }

        catch(NumberFormatException ex)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already caught by above catch block
        }*/



        /*try
        {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly

            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }*/



        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");

           // throw ex;     //Re-throwing NullPointerException
        }
       /* NullPointerException is caught here
        Exception in thread "main" java.lang.NullPointerException
        at com.main.interview.ExceptionHandingdem.main(ExceptionHandingdem.java:40)*/


    }
}
//https://www.scientecheasy.com/2020/09/exception-handling-interview-questions.html/