package com.clyang.behavior.iterator.intrinsic;

public class ConcreteAggregate extends Aggregate {
    private Object[] abjArray;

    public ConcreteAggregate(Object[] abjArray) {
        this.abjArray = abjArray;
    }

    @Override
    Iterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        private int index = 0;
        private int size;

        public ConcreteIterator() {
            this.size = abjArray.length;
        }

        @Override
        public void first() {
            index = 0;

        }

        @Override
        public void next() {
            if (index < size) {
                index++;
            }

        }

        @Override
        public boolean isDone() {
            return (index >= size);
        }

        @Override
        public Object currentItem() {
            return abjArray[index];
        }
    }

}
