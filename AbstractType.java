interface AbstractType {
    String swiftType();
    String jsType();
    AbstractType resulting(String accessor);
}