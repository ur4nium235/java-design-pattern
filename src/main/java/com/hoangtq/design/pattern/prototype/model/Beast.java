package com.hoangtq.design.pattern.prototype.model;

/**
 * @author : hoangtq
 * @since : 10:58 02/09/2020, Wed
 **/
public abstract class Beast implements Prototype {
    public Beast() {
    }

    public Beast(Beast source) {
    }

    @Override
    public abstract Object copy();

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
}
