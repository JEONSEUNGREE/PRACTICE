public class BackToFront {
    public static void main(String[] args) {
        String str = "Information!";
        int n = str.length();
        char st[] = new char[n];
        n--;//배열길이 조정
        for (int i = n; i >= 0; i--) {
            st[n-i] = str.charAt(i);
        }
        for (char i : st) {
            System.out.printf("%c", i);
        }
    }
}
