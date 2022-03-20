package Anograms;

public class IsAnogramStringCopy {

    public static void main(String[] args) {

        if(isAnogram("poooooooooooooooooooooooooooooooooop")){
            System.out.println("is true");
        }else{
            System.out.println("is false");
        }
    }

    public static boolean isAnogram(String word){
        char[] chars = new char[word.length()];
        char[] charsBackword = new char[word.length()];

        for (int i = 0; i < word.length(); i++ ){
            chars[i] = word.charAt(i);
        }
        for (int i = word.length()-1; i >= 0 ; i-- ){
            charsBackword[word.length()-i-1] = word.charAt(i);
        }

        String wordBackword = String.valueOf(charsBackword);
        if(wordBackword.equals(word)){
            return true;

        }
        else {
            return false;
        }
    }


}
