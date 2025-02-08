public class Hofstadter {
    public static int gSequence(int n){
        if (n == 0){
            return 0;
        }
        return n - gSequence(gSequence(n-1));
    }

    public static void main(String[] args){
        for (int i = 0; i <= 10; i++){
            System.out.println("gSequence(" + i + ")== " + gSequence(i));
        }
    }
}
