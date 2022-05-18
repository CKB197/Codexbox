package assessment;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'I';
        switch (ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel ");
                break;
            default :
                System.out.println(ch + " is consonant");
                break;

        }
    }
}
