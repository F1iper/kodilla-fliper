package kodilla.testing.result;

import kodilla.testing.Execute;
import kodilla.testing.ExecuteFunction;
import kodilla.testing.FunctionResult;

public class Main {

    public static void main(String[] args) {
        String sentence = "w31rd s3nt3nc3 1s that";
        String sentence2 = "3v3n w31rd3r s3nt3nc3 1s h3r3";

        ExecuteFunction executeFunction = new ExecuteFunction();
        FunctionResult functionResult = new FunctionResult();
        executeFunction.beautify(sentence, (String) -> functionResult.process(sentence));
        executeFunction.beautify(sentence2, (String) -> functionResult.process(sentence2));


    }
}