abstract class AbstractType {
    public boolean isOptional;
    abstract String swiftType();
    abstract String jsType();
    abstract AbstractType resulting(String accessor);
    abstract AbstractType copy();
}