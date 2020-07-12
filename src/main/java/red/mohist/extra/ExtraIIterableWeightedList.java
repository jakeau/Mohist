package red.mohist.extra;

import net.minecraft.util.WeightedList;

import java.util.Iterator;

public interface ExtraIIterableWeightedList<U> extends Iterable<U> {
    Iterator<U> iterator();

    @SuppressWarnings("unchecked")
    static <T> Iterable<? extends T> cast(WeightedList<T> list) {
        return ((ExtraIIterableWeightedList<T>) list);
    }

    class ListIterator<U> implements Iterator<U> {
        private final Iterator<WeightedList<U>.Entry<? extends U>> inner;

        public ListIterator(Iterator<WeightedList<U>.Entry<? extends U>> inner) {
            this.inner = inner;
        }

        @Override
        public boolean hasNext() {
            return this.inner.hasNext();
        }

        @Override
        public U next() {
            return this.inner.next().func_220647_b();
        }
    }
}
