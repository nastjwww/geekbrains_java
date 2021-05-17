public class Employee {
    String fullname;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String fullname,
             String position,
             String email,
             String phone,
             int salary,
             int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] team = {
                new Employee("Ivan Grozniy", "King", "red@square.ru", "-", 100500, 50),
                new Employee("Normal Jean", "Employee", "test@test.ru", "8999771631613", 25000, 23),
                new Employee("I Van", "Cook", "cook@book.com", "0771232", 80000, 32),
                new Employee("Lil Evance", "Bloger", "lil@travel.com", "666777888", 999999, 51),
                new Employee("Woody Woodpecker", "Woodpecker", "wood@wood.net", "-", 300, 55),
        };

        for (int i = 0; i < team.length; i++) {
            if (team[i].age >= 40) {
                team[i].print();
            }
        }
    }

    void print() {
        System.out.printf("name = %s, position = %s, email = %s, phone = %s, salary = %d, age = %d\n",
                fullname, position, email, phone, salary, age);
    }
}
