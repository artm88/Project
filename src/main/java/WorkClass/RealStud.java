package WorkClass;

public class RealStud {
    public static void main(String[] args) {
        StudentExtends student=new StudentExtends("",0,0,0,0); // создание карточки студента Арт Ко
        student.showInfo(); // вывод информации по карточке студента
        student.setFio("Арт Кор"); // задание всех полей карточки студента Арт Кор
        student.setAge(18);
        student.setId(101);
        student.setEnergyLevel(5);
        student.setKnowledgeLevel(5);
        student.showInfo();
        student.study(5);  // обучение студента Арт Кор
        student.showInfo();
        student.rest(5);// отдых студента Арт Кор
        student.showInfo();
    }
}
