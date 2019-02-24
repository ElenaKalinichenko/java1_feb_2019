package lesson_5;

public class main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        employee[1] = new Employee("Petrov Ivan", "programmist", "petrov@mailbox.com", "892312312", 30000, 20);
        employee[2] = new Employee("Sidorov Ivan", "Engineer", "sidorov@mailbox.com", "892312312", 30000, 33);
        employee[3] = new Employee("Garkin Ivan", "Engineer", "garkin@mailbox.com", "892312312", 30000, 50);
        employee[4] = new Employee("Muhin Ivan", "Engineer", "muhin@mailbox.com", "892312312", 30000, 45);



               // employee.printInfo();
        for (int i = 0; i < 5; i++) {
            if(employee[i].age>40)
                employee[i].printInfo();
        }
    }



}
