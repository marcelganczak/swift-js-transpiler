abstract class AbstractType {
    public boolean isOptional;
    abstract String sourceType();
    abstract String targetType(String language);
    abstract AbstractType resulting(String accessor);
    abstract AbstractType copy();
}