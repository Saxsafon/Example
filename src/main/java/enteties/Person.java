package enteties;

public class Person {
    private String name;
    private String sername;
    private Long id;

    // два конструктора класса

    public Person(){}

    public Person(String name,String sername){
        this.name = name;
        this.sername = sername;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
