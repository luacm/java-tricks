public class CharacterMathDemo {
    
    public static void main(String[] args) {
        // Something simple
        int five = '5' - '0';
        System.out.println("The character '5' has a decimal value of " + five);

        int positionOfG = 'g' - 'a';
        System.out.println("The character 'g' is the " + (positionOfG + 1) + "th letter of the alphabet.");

        // Something a bit trickier
        int n1 = parseInt("1");
        int n2 = parseInt("8675308");
        System.out.println(n1 + n2);
    }

    private static int parseInt(String s) {
        int sum = 0;
        int placeValue = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = s.charAt(i) - '0';
            sum += val * placeValue;
            placeValue *= 10;
        }
        return sum;
    }
}