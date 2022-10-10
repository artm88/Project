package WorkClass;

public class StudentExtends extends AbstractStudent{ // шаблон для студентов с обучением
    public  StudentExtends (String fio, int age,long id,int knowledgeLevel,int energyLevel){
        super(fio,age,id,knowledgeLevel, energyLevel);
    }
    @Override
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
}
