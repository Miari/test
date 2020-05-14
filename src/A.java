public class A {

    public static void main(String[] args) {
        new B().doPublic();
    }

    public void doPublic() {
        doInternal();
    }

    private void doInternal() {
        System.out.println("Do internal in A");
    }
}

class B extends A {
    public void doInternal() {
        System.out.println("Do internal in B");
    }
}

