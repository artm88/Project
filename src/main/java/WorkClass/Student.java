package WorkClass;

public class Student {// класс для создания персональной карточки студентов для отслеживания уровней их знаний и здоровья
    private String fio; //ФИО
    private int age; // возраст
    private long id; // идентификатор
    private int knowledgeLevel; // уровень знания студента
    private int energyLevel; // уровень здоровья студента
    public void study (int hours){ // отсеживание уровней знания и здоровья при обучение студента
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
    public void rest (int hours) { // отсеживание уровней знания и здоровья при отдыхе студента
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
    public void showInfo(){ // вывод карточки студента
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
    } // выставление и запрос полей информации о студенте
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
    public Student (String fio) {this.fio=fio;    } // инициализация карточек студента с различными полями данных
    public Student (String fio, int age) {this.fio=fio; this.age=age;   }
    public Student (String fio, int age,long id) {this.fio=fio; this.age=age; this.id=id;  }
    public Student (String fio, int age,long id,int knowledgeLevel,int energyLevel){
        this.fio=fio; this.age=age; this.id=id;this.knowledgeLevel=knowledgeLevel; this.energyLevel=energyLevel; }
}
