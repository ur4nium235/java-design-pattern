package com.hoangtq.design.pattern.prototype.model;

/**
 * @author : hoangtq
 * @since : 16:25 02/09/2020, Wed
 **/
public class ElfMage extends Mage{
    private final String helpType;

    public ElfMage(String helpType) {
        this.helpType = helpType;
    }

    public ElfMage(ElfMage source) {
        super(source);
        this.helpType = source.helpType;
    }

    @Override
    public ElfMage copy() {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "ElfMage{" +
                "helpType='" + helpType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ElfMage other = (ElfMage) obj;
        if (helpType == null) {
            return other.helpType == null;
        }
        return helpType.equals(other.helpType);
    }
}
