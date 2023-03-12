package seminar7.observer;

// Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
public class Main {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        MonopolyService monopolyService = new MonopolyService(25);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(monopolyService);

        for(int i = 0; i< 10; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
