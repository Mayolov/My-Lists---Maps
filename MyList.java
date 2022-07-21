import java.util.Collection;

public interface MyList<E> extends Collection<E> {
    public void add(int index, E e);

    public E get(int index);

    public int indexOf(Object e);

    public int lastIndexOf(E e);

    public E remove(int index);

    public E set(int index, E e);

    @Override
    public default boolean add(E e) {
        add(size(), e);
        return true;
    }

    @Override
    public default boolean remove(Object e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        }
        return false;
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c) {
        return true;
    }

    @Override
    public default boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public default boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return true;
    }

    public default Object[] toArray() {
        return null;
    }

    @Override
    public default <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }
}