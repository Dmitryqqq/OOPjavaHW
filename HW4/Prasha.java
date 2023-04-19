public class Prasha extends Throwing{
    private String name;
        public Prasha(int range) {
            super(range);
            this.name = "Праща";
        }
    
        @Override
        public int damage() {
            return 20;
        }
    
        @Override
        public String toString() {
            StringBuilder res = new StringBuilder();
            res.append(name)
                    .append(String.format("\n\t%s", super.toString()));
            return res.toString();
        }
    }