package Students;
// an immutable class
final class ImmutableString {
    private final String name ;
    private final long reg_no;
    private final String blood_group;
    private final float percentage;

    public ImmutableString(String name, long reg_no, String blood_group, float percentage){

        this.reg_no = reg_no;
        this.name= name;
        this.blood_group= blood_group;
        this.percentage= percentage;

    }

    public String getName() {
        return name;
    }

    public long getReg_no() {
        return reg_no;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public float getPercentage() {
        return percentage;
    }
}
