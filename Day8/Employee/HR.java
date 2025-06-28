package Day8.Employee;

import java.util.HashMap;

public class HR extends Employees{

    int index = 0;

    public void addNewEmployee(HashMap<Integer, Employees> employees, int id, String name){
        Employees employee = new Employees(name, id);
        employees.put(index, employee);
        System.out.println("Employee added successfully!");
        index ++;
    }

    public void removeEmployee(HashMap<Integer, Employees> employees, int id){
        int count = -1;
        for(HashMap.Entry<Integer, Employees> entry : employees.entrySet()){
            if(id == entry.getValue().id){
                employees.remove(entry.getKey());
                count++;
                System.out.println("Entry Removed");
            }
        }
        if(count==-1){
            System.out.println("No employee matched to remove!");
        }
    }

    public void fetchEmployee(HashMap<Integer, Employees> employees, int id){
        boolean present = false;
        for(HashMap.Entry<Integer, Employees> entry : employees.entrySet()){
            if(id == entry.getValue().id){
                System.out.println("The employee is:");
                System.out.println("Name: "+entry.getValue().name + " ID: "+entry.getValue().id);
                present = true;
            }
        }
        if(!present){
            System.out.println("No employee found with that ID");
        }
    }

    public void displayAll(HashMap<Integer, Employees> employees){
        for(Employees i : employees.values()){
            System.out.println(i);
        }
    }
}
