package programms;

import enteties.Person;

import java.util.concurrent.atomic.AtomicLong;

public class Methods {
    static AtomicLong counter = new AtomicLong(); // экземпляр класса, который нужен чтобы сгенерировать ID
    public static void addId(Person person){ // функция генерирующая ID лля персоны
        Long id = counter.incrementAndGet();
        person.setId(id);


    }
}
