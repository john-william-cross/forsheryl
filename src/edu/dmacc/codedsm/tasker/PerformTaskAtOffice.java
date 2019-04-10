package edu.dmacc.codedsm.tasker;


import java.util.List;

public class PerformTaskAtOffice extends TaskPerformer {
    @Override
    public void performTask(User Assigner, User FirstName) {
        super.performTask(Assigner, FirstName);
        System.out.printf("%s", "performTask");
    }

    @Override
    public void performTask(Task Task, List<String> Users) {
        super.performTask(Task, Users);
    }
}