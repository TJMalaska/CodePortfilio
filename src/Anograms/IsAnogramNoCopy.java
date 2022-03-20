package Anograms;

public class IsAnogramNoCopy {
    public static void main(String[] args) {

        if(isAnogram("poooooooooooooooooooooooooooooooooop")){
            System.out.println("is true");
        }else{
            System.out.println("is false");
        }
    }

    public static boolean isAnogram(String word){
        for(int i = 0; i >= word.length()/2; i++){
            if (word.charAt(i)==word.charAt(word.length()-1-i)){
                if (i == word.length()/2){
                    return true;
                }
            }
        }
        return false;
    }
}
