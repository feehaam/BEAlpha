public class T36AnonymousClasses {
    public static void main(String[] args) {
        // error: Plant p = new Plant();
        Plant p = new Plant(){
            @Override
            public void grow() {
                System.out.println("Plant is growing...");
            }
        };
        p.grow();
    }
}

interface Plant{
    public void grow();
}
