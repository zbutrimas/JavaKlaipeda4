package Advanced.generics.example1;

public class GenericBox<T> {

    private T item;

    public GenericBox(T item){
    }

    public T getItem() {
        return item;
    }
}
