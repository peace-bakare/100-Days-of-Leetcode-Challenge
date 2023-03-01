public class Trim {
    public String trimSentence(String s){
        s = s.trim();
        return s;
    } 

    public void Main(String[]args){
        String word = "  fly me  to the moon  ";
        System.out.println(trimSentence(word));
    }
}
