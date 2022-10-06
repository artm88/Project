package WorkClass;

public class Student {
    private String fio;
    private int age;
    private long id;
    private int knowledgeLevel;
    private int energyLevel;
    public void study (int hours){
        if (hours>0&energyLevel>0&knowledgeLevel<10){
            if (hours<=energyLevel) {
                knowledgeLevel=knowledgeLevel+hours;
                energyLevel=energyLevel-hours;
                if (knowledgeLevel>10) {
                    knowledgeLevel=10;
                }
                if (energyLevel<10) {
                    energyLevel=0;
                }
            }
            else {
                knowledgeLevel=knowledgeLevel+energyLevel;
                energyLevel=0;
                if (knowledgeLevel>10) {
                    knowledgeLevel=10;
                }
            }
        }
    }
    public void rest (int hours) {
        if (hours>0){
            knowledgeLevel=knowledgeLevel-hours;
            energyLevel=energyLevel+hours;
            if (knowledgeLevel<0) {
                knowledgeLevel=0;
            }
            if (energyLevel>10) {
                energyLevel=10;
            }
        }
    }
    public void showInfo(){
        System.out.println("-------------------");
        System.out.println("ФИО "+fio);
        System.out.println("Возраст "+age);
        System.out.println("Идентификатор "+id);
        System.out.println("Уровень знаний "+knowledgeLevel);
        System.out.println("Уровень энергии "+energyLevel);
        System.out.println("-------------------");
    }
    public void setFio (String fio){
        this.fio=fio;
    }
    public String getFio(){
        return fio;
    }
}
