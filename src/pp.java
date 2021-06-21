class parets {
    int a;

    public parets(int a) {
        this.a = a;
    }

}

class child extends parets{
    int b;

    public child(int b) {
        super(b);
        this.b = b;
    }

    public void apple() {

    }
}

public class pp {
    public static void main(String[] args) {
        parets child = new child(1);

    }
}
