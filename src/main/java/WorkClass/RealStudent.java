package WorkClass;

public class RealStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.fio = "Арт Ко";
        student.age=18;
        student.id=101;
        student.energyLevel=5;
        student.knowledgeLevel=5;
        student.showInfo();
        student.study(5);
        student.showInfo();
        student.rest(5);
        student.showInfo();
    }
}
