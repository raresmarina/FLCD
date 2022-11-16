package model;

import java.util.Arrays;
import java.util.List;

public class LanguageSpecification {
    private List<String> reservedWords = Arrays.asList("array", "string", "const", "else", "verif", "integer", "read",
            "print", "wloop", "floop", "def");
    private List<String> operators = Arrays.asList("+", "-", "*", "/", "%", "=", "<=", ">=", "<", ">","<-");
    private List<String> separators = Arrays.asList("(", ")", ";", "{", "}","[", "]", " ", ":");

    public LanguageSpecification() {
    }

    public boolean isReservedWord(String token) {
        return reservedWords.contains(token);
    }

    public boolean isOperator(String token) {
        return operators.contains(token);
    }

    public boolean isPartOfOperator(char op) {
        return op == '!' || isOperator(String.valueOf(op));
    }

    public boolean isSeparator(String token) {
        return separators.contains(token);
    }

    public boolean isIdentifier(String token) {
        String pattern = "^[a-zA-Z]([a-z|A-Z|0-9|_])*$";
        return token.matches(pattern);
    }

    public boolean isConstant(String token) {
        String numericPattern = "^0|[+-]?[1-9][0-9]+(\\.\\d+)?";
        String charPattern = "^'[a-zA-Z0-9_?!#*./%+=<>;)(}{ ]\'";
        String stringPattern = "^\"[a-zA-Z0-9_?!#*./%+=<>;)(}{ ]+\"";
        return token.matches(numericPattern) ||
                token.matches(charPattern) ||
                token.matches(stringPattern);
    }

}
