package main;

class CodeBuilder {
    protected StringBuilder sb = new StringBuilder();

    public CodeBuilder(String className) {
        sb
                .append("public class ")
                .append(className)
                .append("\n{\n");
    }

    public CodeBuilder addField(String name, String type) {
        sb
                .append("\tpublic ")
                .append(type)
                .append(" ")
                .append(name)
                .append(";\n");
        return this;
    }

    @Override
    public String toString() {
        sb.append("}");
        return sb.toString();
    }
}