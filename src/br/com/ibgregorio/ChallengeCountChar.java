package br.com.ibgregorio;

public class ChallengeCountChar {

    static void countChars(String str) {
        if (str != null && !str.isBlank()){
            str.chars().forEach(codeChar -> {
                Character selectedChar = (char) codeChar;
                Integer decodedChar = decodeChar(selectedChar);
                System.out.println(selectedChar + " = " + decodedChar);
            });
        }
    }

    static int decodeChar(char selectedChar) {
        switch (selectedChar) {
            case 'a': case 'c':
                return 2;
            case 'B': case 'b': case 'C': case 'D': case 'd':
                return 1;
            default:
                return 0;
        }
    }



    public static void main(String[] args) {
        countChars("acdBCDabc"); // {a=2, B=1, b=1, c=2, C=1, d=1, D=1}
    }
}
