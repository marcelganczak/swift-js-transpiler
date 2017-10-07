abstract class AbstractType {
    public boolean isOptional;
    public boolean isGetterSetter;
    abstract String swiftType();
    public String targetType(String language) { return targetType(language, false, false); }
    abstract String targetType(String language, boolean notGeneric);
    public String targetType(String language, boolean notGeneric, boolean baseIfGetterSetter) {
        String baseTargetType = targetType(language, notGeneric);
        if(!isGetterSetter || baseIfGetterSetter) return baseTargetType;
        return "{get: () => " + baseTargetType + ", set: (val: " + baseTargetType + ") => void}";
    }
    abstract AbstractType resulting(String accessor);
    abstract AbstractType copy();
    public boolean copiedOnAssignment() {
        return false;
    }
}