package figure;

public abstract class ClassFigure { // шаблон для всех фигур
    private String color;   // цвет фигур

    public ClassFigure(String color) { // создание шаблона
    }

    abstract public int calcOfSquare (int a, int b) ; // Площадь фигуры
    abstract public int calcOfPerimeter (int a, int b) ;// Периметр фигуры

}
