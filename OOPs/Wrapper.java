package OOPs;

public class Wrapper {
    private int  a=100 ;
    private  byte by = 27 ;
    private short s ;
    private long l = 70;
    private double d = 60;
    private char c = 40;
    private float f = 50f;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    // convert primitive data types into wrapper classes
    Integer integer = new Integer(a);
    byte abyte = new Byte(by);
    Short ashort = new Short(s);
    Character achar = new Character(c);




    public int geta() {
        return a;
    }

    public void seta(int i) {
        this.a = i;
    }

    public byte getBy() {
        return by;
    }

    public void setBy(byte by) {
        this.by = by;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }
}
