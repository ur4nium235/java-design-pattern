package com.hoangtq.design.pattern.adapter;

/**
 * @author : hoangtq
 * @since : 22:50 02/09/2020, Wed
 **/
public final class Captain {
    private RowingBoat rowingBoat;

    public Captain() {
    }

    public Captain(final RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public RowingBoat getRowingBoat() {
        return rowingBoat;
    }

    public void setRowingBoat(final RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row() {
        rowingBoat.row();
    }
}
