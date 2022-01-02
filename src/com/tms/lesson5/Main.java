package com.tms.lesson5;

import com.tms.lesson6.SimpleSearch;

public class Main {

    public static void main(String[] args) {
        Director chiefDirector = new Director("Ann", "Hann", 10);
        Director viceDirector = new Director("Max", "Mann", 7);
        Worker worker1 = new Worker("Dan", "Dall", 3);
        Worker worker2 = new Worker("Ivan", "Ivanov", 5);

        chiefDirector.addWorker(viceDirector);
        chiefDirector.addWorker(worker1);
        viceDirector.addWorker(worker2);
        viceDirector.addWorker(new Worker("Yan", "Li", 2));

        System.out.println(chiefDirector);

        chiefDirector.printInformationAboutEmployee(worker1.getFullName());

        System.out.println(chiefDirector.getEmployeeByName(worker1.getFullName(), "-d"));
    }
}
