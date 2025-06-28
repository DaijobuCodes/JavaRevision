package Day8.Employee;

public class Employees {
    public int id;
    public String name;

    public Employees(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Employees(){}

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " Name: " + this.name;
    }

}
