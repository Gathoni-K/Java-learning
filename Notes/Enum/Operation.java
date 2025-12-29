/*
-Create an enum Operatio with:
    ADD
    SUBTRACT
    MULTIPLY

-Each operation should implement:
    'int apply(int a, int b);'

-Each enum constant is an object that knows how to behave.
*/


package Notes.Enum;

public enum Operation {
    ADD{
        @Override
        public int apply(int a, int b){
            return a + b;
        }
    },
    /*
    -Create an Operation called ADD and override its apply method
    -Each constant has its own mini subclass
    */
    SUBTRACT{
        @Override
        public int apply( int a, int b){
            return a - b;
        }
    },
    MULTIPLY{
        @Override
        public int apply(int a, int b){
            return a * b;
        }
    };

    public abstract int apply(int a, int b);

    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(4, 2));       // 6
        System.out.println(Operation.SUBTRACT.apply(4, 2));  // 2
        System.out.println(Operation.MULTIPLY.apply(4, 2));  // 8
    }
}


