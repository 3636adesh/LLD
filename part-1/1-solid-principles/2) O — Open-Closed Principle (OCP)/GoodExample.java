/**
 *  write code based on image : docs/images/open-closed.webp
 *
 */

//what

interface Task{

    void execute();

}


class CutTask implements Task{

    public void execute() {
        System.out.println("Cutting....!");
    }

}


class PaintTask implements Task{

    public void execute() {
        System.out.println("Painting...!");
    }

}

//who

class Robot{

    public void runTask(Task task){
        task.execute();
    }

}


void main() {
    Robot r=new Robot();
    r.runTask(new PaintTask());
    r.runTask(new PaintTask());
}


// Robot = same (no modification)
// Tools = new classes (extension)
// Behavior added = without touching existing code