package com.hoangtq.design.pattern.prototype.model;

import java.util.Objects;

/**
 * @author : hoangtq
 * @since : 11:02 02/09/2020, Wed
 **/
public class ElfBeast extends Beast {
    private final String helpType;

    public ElfBeast(String helpType) {
        this.helpType = helpType;
    }

    public ElfBeast(ElfBeast source) {
        super(source);
        this.helpType = source.helpType;
    }

    @Override
    public Object copy() {
        return new ElfBeast(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElfBeast elfBeast = (ElfBeast) o;
        return Objects.equals(helpType, elfBeast.helpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpType);
    }

    @Override
    public String toString() {
        return "ElfBeast{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
