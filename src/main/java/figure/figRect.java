package figure;

public class figRect extends ClassFigure implements Drawable{ // шаблон с определением класса фигуры и отображением
    private int length;//длина
    private int width;//ширина
    public  figRect (String color){
        super(color);}
    @Override
    public int calcOfSquare (int a, int b) { // вычисление площади фигуры
        int square=a*b;
        System.out.print(Integer.toString(square));
        return square;
    }
    @Override
    public int calcOfPerimeter (int a, int b) { // вычисление периметра фигуры
        int Perimeter=(a+b)*2;
        System.out.print(Integer.toString(Perimeter));
        return Perimeter;
    }
    private void defineOfFig (int a, int b) { // определение типа фигуры
        if (a==b) {
            System.out.print(" квадрат ");
        }
        else {
            System.out.print(" прямоугольник " );
        }
    }
    public void draw (int a, int b, String color){ // отображение фигуры
        System.out.println(""); // надпись
        System.out.print(color);
        defineOfFig(a,b);
        System.out.print("с площадью ");
        calcOfSquare(a,b);
        System.out.print(" и периметром ");
        calcOfPerimeter(a,b);
        System.out.println("");
        for (int i=0; i<a;i+=1){ // изображение
            System.out.print("-");

        }
        System.out.println();
        for (int i=0; i<b;i+=1){
            System.out.print("|");
            for (int j=0; j<a-2;j+=1) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        for (int i=0; i<a;i+=1){
            System.out.print("-");
        }
    }
}
