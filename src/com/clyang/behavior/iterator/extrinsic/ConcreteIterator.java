package com.clyang.behavior.iterator.extrinsic;

public class ConcreteIterator implements Iterator{
   private ConcreteAggregate agg;
   private int index;
   private int size;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size=agg.size();
        this.index=0;
    }

    @Override
    public void first() {
        this.index=0;

    }

    @Override
    public void next() {
        if(index <size){
            index ++;
        }

    }

    @Override
    public boolean isDone() {

        return index >=size;
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
