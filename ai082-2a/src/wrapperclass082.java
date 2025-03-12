public class wrapperclass082 {
    public static void main(String[] args) {
        int primitiveInt = 5;
        Integer boxedInt = primitiveInt;
        System.out.println("Boxed Integer: " + boxedInt);
        double primitiveDouble = 10.5;
        Double boxedDouble = primitiveDouble;
        System.out.println("Boxed Double: " + boxedDouble);
        char primitiveChar = 'A';
        Character boxedChar = primitiveChar;
        System.out.println("Boxed Character: " + boxedChar);
        boolean primitiveBoolean = true;
        Boolean boxedBoolean = primitiveBoolean;
        System.out.println("Boxed Boolean: " + boxedBoolean);
        Integer unboxedInt = boxedInt;
        System.out.println("Unboxed Integer: " + unboxedInt);
        Double unboxedDouble = boxedDouble;
        System.out.println("Unboxed Double: " + unboxedDouble);
        Character unboxedChar = boxedChar;
        System.out.println("Unboxed Character: " + unboxedChar);
        Boolean unboxedBoolean = boxedBoolean;
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
    }
}
