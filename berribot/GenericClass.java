package berribot;

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> integerBox= new Box<>(22);
        System.out.println(integerBox.getValue());

        Box<String> stringBox= new Box<>("Hello");
        System.out.println(stringBox.getValue());
    }
}

class Box<T> {
    public T value;

    Box(T value){
        this.value=value;
    }

    public T getValue(){
        return this.value;
    }
}


