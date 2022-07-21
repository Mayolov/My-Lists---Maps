import java.util.Collection;

interface Tree<E> extends Collection<E> {

    public boolean search(E e);

    public boolean insert(E e);

    public boolean delete(E e);

    public int getSize();

    public default void inorder() {

    }

    public default void postorder() {

    }

    public default void preorder() {

    }

    @Override
    public default boolean isEmpty() {
        // TODO Auto-generated method stub
        return size() == 0;
    }

    @Override
    public default boolean contains(Object e) {
        // TODO Auto-generated method stub
        return search((E) e);
    }

    @Override
    public default boolean add(E e) {
        // TODO Auto-generated method stub
        return insert(e);
    }

    @Override
    public default boolean remove(Object e) {
        // TODO Auto-generated method stub
        return delete((E) e);
    }

    @Override
    public default int size() {
        // TODO Auto-generated method stub
        return getSize();
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public default boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public default boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public default Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public default <T> T[] toArray(T[] array) {
        // TODO Auto-generated method stub
        return null;
    }
}
