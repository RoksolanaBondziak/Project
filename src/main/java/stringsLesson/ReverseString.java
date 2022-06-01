package stringsLesson;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("Ukrainian");
//dog --> god
//        get the last letter (length -1) and add it as the first letter of new word

    }

    public void reverseString(String txtToReverse) {
        if (txtToReverse == null || txtToReverse.isEmpty() || txtToReverse.isBlank()) {
            System.out.println("The string is null or empty");
        } else {

            System.out.println(String.format("The input string is %s" , txtToReverse));
            String result = "";
            int lastLetter = txtToReverse.length() - 1;
            for(int i = lastLetter; i>=0; i--){
                result = result + txtToReverse.charAt(i);
            }
            System.out.println(result);
        }
    }
}