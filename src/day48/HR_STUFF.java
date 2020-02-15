package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_STUFF {
    public static void main(String[] args) {
        // Employee is abstract super type
        // hourlyEmployee and Full time Employee is specific type
       Employee e1 = new HourlyEmployee("subi", 101,55,2000);

      //  e1 = new FulltimeEmployee("Yerqa", 103,10000);
       // e1.calculateAnnualSalary();
        Employee e2 = new HourlyEmployee("Yerqanat", 102,57,2080);
        Employee e3 = new FulltimeEmployee("Janar", 101,13000);

        List<Employee> allEmployee = Arrays.asList(e1,e2,e3);

        for (Employee each:allEmployee
             ) {
            System.out.println("Name is "+each.name.toUpperCase());
            each.calculateAnnualSalary();

            
        }




    }
}
