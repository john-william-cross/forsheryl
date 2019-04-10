package edu.dmacc.codedsm.tasker;


public class Runner {

    private static Task inPersonAssigner;

    public static void setInPersonAssigner(Task inPersonAssigner) {
        Runner.inPersonAssigner = inPersonAssigner;
    }

    public Runner() {
    }

    public static void main(String[] args) {
        System.out.println("Starting Runner....");

        TaskAssigner emailAssigner = new EmailTaskAssigner();
        TaskAssigner phoneAssigner = new PhoneTaskAssigner();
        TaskAssigner inPersonAssigner = new InPersonTaskAssigner();
        User name = new User("Sheryl");

        emailAssigner.TaskAssinger(name, 10);
        phoneAssigner.TaskAssigner(name, 5);
        inPersonAssigner.TaskAssigner(name, 3);

        TaskPerformer PerformTaskInPerson = new PerformTaskInPerson();
        TaskPerformer PerformTaskAtOffice = new PerformTaskAtOffice();
        TaskPerformer PerformTaskDelegationTrainee = new PerformTaskDelegationTrainee(); /*sheryl, when this object is instantiated, the SOUT statment is printed when you run the program.
        make sure the other objects print out a similar statemtent*/
        User Assigner = new User("Sheryl");

        /*TaskPerformer.performTask(Assigner, User FirstName);  // method overloading
        TaskPerformer.performTask(Assigner, User FirstName, User LastName, User ContactInfo);*/




    }


    private static User newUser() {
        User user = newUser();
        return user;
    }

    private static void Assigner(String sheryl) {
    }
}
