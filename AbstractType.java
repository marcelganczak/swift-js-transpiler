abstract class AbstractType {
    public boolean isOptional;
    abstract String swiftType();
    abstract String targetType(String language);
    abstract String targetType(String language, boolean notGeneric);
    abstract AbstractType resulting(String accessor);
    abstract AbstractType copy();
}