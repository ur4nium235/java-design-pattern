package com.hoangtq.design.pattern.prototype.model;

/**
 * @author : hoangtq
 * @since : 16:25 02/09/2020, Wed
 **/
public abstract class Mage implements Prototype {

    public Mage() {
    }

    public Mage(Mage source) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return getClass() == obj.getClass();
    }

    @Override
    public abstract Object copy();
}
