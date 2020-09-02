package com.hoangtq.design.pattern.prototype.model;

import java.util.Objects;

/**
 * @author : hoangtq
 * @since : 16:31 02/09/2020, Wed
 **/
public class OrcBeast extends Beast {
    private final String weapon;

    public OrcBeast(String weapon) {
        this.weapon = weapon;
    }

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public Object copy() {
        return new OrcBeast(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrcBeast orcBeast = (OrcBeast) o;
        return Objects.equals(weapon, orcBeast.weapon);
    }

    @Override
    public String toString() {
        return "OrcBeast{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
