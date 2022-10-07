package WorkClass;

public class RealStudent {
    public static void main(String[] args) {
        Student student=new Student("Арт Ко");
        student.showInfo();
        student.setFio("Арт Кор");
        student.setAge(18);
        student.setId(101);
        student.setEnergyLevel(5);
        student.setKnowledgeLevel(5);
        student.showInfo();
        student.study(5);
        student.showInfo();
        student.rest(5);
        student.showInfo();
    }
}
