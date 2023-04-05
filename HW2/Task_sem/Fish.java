abstract class Fish extends Animal implements Swimable{
        private String name;
        public abstract String feed(); 


    public Fish(String name) {
        super(name);

    
    }

    // @Override
    // public String toString() {
    // // 
    // return String.format("Особь: %s питается: %s", this.name, feed() );
    // }
}
