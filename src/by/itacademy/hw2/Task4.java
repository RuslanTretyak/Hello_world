package by.itacademy.hw2;

public class Task4 {

    public static void main(String[] args) {

        byte by = 100;
        short s = 1000;
        char ch = 'r';
        int in = 33000;
        long l = 2147483649L;
        float f = 0.0000005f;
        double d = 0.00006d;

        convByte(by);
        convShort(s);
        convChar(ch);
        convInt(in);
        convLong(in);
        convFloat(f);
        convDouble(d);

    }
    public static void convByte(byte by) {

        char chBy = (char) by;
        short sBy = by;
        int inBy = by;
        long lBy = by;
        float fBy = by;
        double dBy = by;
        System.out.println("byte " + by + " conv. to char = " + chBy);
        System.out.println("byte " + by + " conv. to short = " + sBy);
        System.out.println("byte " + by + " conv. to int = " + inBy);
        System.out.println("byte " + by + " conv. to long = " + lBy);
        System.out.println("byte " + by + " conv. to float = " + fBy);
        System.out.println("byte " + by + " conv. to double = " + dBy);
    }
    public static void convShort(short s) {

        byte byS = (byte) s;
        char chS = (char) s;
        int inS = s;
        long lS = s;
        float fS = s;
        double dS = s;
        System.out.println("short " + s + " conv. to byte = " + byS);
        System.out.println("short " + s + " conv. to char = " + chS);
        System.out.println("short " + s + " conv. to int = " + inS);
        System.out.println("short " + s + " conv. to long = " + lS);
        System.out.println("short " + s + " conv. to float = " + fS);
        System.out.println("short " + s + " conv. to double = " + dS);
    }
    public static void convChar(char ch) {

        byte byCh = (byte) ch;
        short sCh = (short) ch;
        int inCh = ch;
        long lCh = ch;
        float fCh = ch;
        double dCh = ch;
        System.out.println("char " + ch + " conv. to byte = " + byCh);
        System.out.println("char " + ch + " conv. to short = " + sCh);
        System.out.println("char " + ch + " conv. to int = " + inCh);
        System.out.println("char " + ch + " conv. to long = " + lCh);
        System.out.println("char " + ch + " conv. to float = " + fCh);
        System.out.println("char " + ch + " conv. to double = " + dCh);
    }
    public static void convInt(int in) {

        byte byIn = (byte) in;
        short sIn = (short) in;
        char chIn = (char) in;
        long lIn = in;
        float fIn = in;
        double dIn = in;
        System.out.println("int " + in + " conv. to byte = " + byIn);
        System.out.println("int " + in + " conv. to short = " + sIn);
        System.out.println("int " + in + " conv. to char = " + chIn);
        System.out.println("int " + in + " conv. to long = " + lIn);
        System.out.println("int " + in + " conv. to float = " + fIn);
        System.out.println("int " + in + " conv. to double = " + dIn);
    }
    public static void convLong(long l) {

        byte byL = (byte) l;
        short sL = (short) l;
        char chL = (char) l;
        int intL = (int) l;
        float fL = l;
        double dL = l;
        System.out.println("long " + l + " conv. to byte = " + byL);
        System.out.println("long " + l + " conv. to short = " + sL);
        System.out.println("long " + l + " conv. to char = " + chL);
        System.out.println("long " + l + " conv. to int = " + intL);
        System.out.println("long " + l + " conv. to float = " + fL);
        System.out.println("long " + l + " conv. to double = " + dL);
    }
    public static void convFloat(float f) {

        byte byF = (byte) f;
        short sF = (short) f;
        char chF = (char) f;
        int intF = (int) f;
        long lF = (long) f;
        double dF = f;
        System.out.println("float " + f + " conv. to byte = " + byF);
        System.out.println("float " + f + " conv. to short = " + sF);
        System.out.println("float " + f + " conv. to char = " + chF);
        System.out.println("float " + f + " conv. to int = " + intF);
        System.out.println("float " + f + " conv. to long = " + lF);
        System.out.println("float " + f + " conv. to double = " + dF);
    }
    public static void convDouble(double d) {

        byte byD = (byte) d;
        short sD = (short) d;
        char chD = (char) d;
        int intD = (int) d;
        long lD = (long) d;
        float fD = (float) d;
        System.out.println("double " + d + " conv. to byte = " + byD);
        System.out.println("double " + d + " conv. to short = " + sD);
        System.out.println("double " + d + " conv. to char = " + chD);
        System.out.println("double " + d + " conv. to int = " + intD);
        System.out.println("double " + d + " conv. to long = " + lD);
        System.out.println("double " + d + " conv. to float = " + fD);
    }
}
