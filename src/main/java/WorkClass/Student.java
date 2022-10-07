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
    public void setAge (int age){        this.age=age;    }
    public int getAge(){        return age;    }
    public void setId (long id){        this.id=id;    }
    public long getId(){        return id;    }
    public void setKnowledgeLevel (int knowledgeLevel){        this.knowledgeLevel=knowledgeLevel;    }
    public int getKnowledgeLevel(){        return knowledgeLevel;    }
    public void setEnergyLevel (int energyLevel){        this.energyLevel=energyLevel;    }
    public int getEnergyLevel(){        return energyLevel;    }
    Student (String fio) {this.fio=fio;    }
    Student (String fio, int age) {this.fio=fio; this.age=age;   }
    Student (String fio, int age,long id) {this.fio=fio; this.age=age; this.id=id;  }
    Student (String fio, int age,long id,int knowledgeLevel,int energyLevel){
        this.fio=fio; this.age=age; this.id=id;this.knowledgeLevel=knowledgeLevel; this.energyLevel=energyLevel; }
}
