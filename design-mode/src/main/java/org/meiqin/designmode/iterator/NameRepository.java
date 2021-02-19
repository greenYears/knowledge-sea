package org.meiqin.designmode.iterator;

/**
 * <p/>
 * NameRepository
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return this.index < NameRepository.this.names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return NameRepository.this.names[this.index++];
            }
            return null;
        }
    }
}
