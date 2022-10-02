package primitiveTypes;

public class Primitive {
    
    public static void main(String[] args) {
        //=== integers ===

    //byte
    byte numberByte = 8; // 8-bit type
    byte maximusByte = Byte.MAX_VALUE;
    byte minimusByte = Byte.MIN_VALUE;

    System.out.printf("%d %d %d\n", numberByte, maximusByte, minimusByte); // output: 8 127 -128

    //short
    short numberShort = 8; // 16-bit type
    short maximusShort = Short.MAX_VALUE;
    short minimusShort = Short.MIN_VALUE;

    System.out.printf("%d %d %d\n", numberShort, maximusShort, minimusShort); // output: 8 32767 -32768

    //integer
    int numberInt = 8; // 32-bit type
    int maximusInt = Integer.MAX_VALUE;
    int minimusInt = Integer.MIN_VALUE;

    System.out.printf("%d %d %d\n", numberInt, maximusInt, minimusInt); // output: 8 2147483647 -2147483648

    //long
    long numberLong = 8; // 64-bit type
    long maximusLong = Long.MAX_VALUE;
    long minimusLong = Long.MIN_VALUE;

    System.out.printf("%d %d %d\n", numberLong, maximusLong, minimusLong); // 8 9223372036854775807 -9223372036854775808

    //char

    char numberChar = 'A'; // 16-bit type Unicode
    char maximusChar = (Character.MAX_VALUE) +0;
    char minimusChar = (Character.MIN_VALUE) +0;

    //System.out.println(numberChar, maximusChar,minimusChar);
    System.out.println(numberChar);
    System.out.println(Integer.valueOf(maximusChar).toString());
    System.out.println(Integer.valueOf(minimusChar).toString());
    

    //=== floating-point types ===

    //float
    float numberFloat = 8.8f; // 32-bit type
    float maximusFloat = Float.MAX_VALUE;
    float minimusFloat = Float.MIN_VALUE;

    System.out.printf("%f %f %f\n", numberFloat, maximusFloat, minimusFloat); // output: 8,800000 340282346638528860000000000000000000000,000000 0,000000

    //double
    double numberDouble = 8.8; // 64-bit type
    double maximusDouble = Double.MAX_VALUE;
    double minimusDouble = Double.MIN_VALUE;

    System.out.printf("%f %f %f\n", numberDouble, maximusDouble, minimusDouble); //8,800000 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000,000000 0,000000


    //=== boolean ===

    boolean trueValue = true;
    boolean falseValue = false;

    System.out.printf("%b %b\n", trueValue, falseValue);

    }
    

}
