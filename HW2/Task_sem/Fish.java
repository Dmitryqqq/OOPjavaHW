abstract class Fish implements Swimable{
        private String name;
        public abstract String feed(); 


    public Fish(String name) {
        this.name = name;

    
    }

    @Override
    public String toString() {
    // 
    return String.format("Особь: %s питается: %s", name, feed() );
    }
}
