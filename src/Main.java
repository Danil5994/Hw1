//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var openingHours=640;
        var worker = openingHours / 8;
        var moreWorkers = worker + 94  ;
        var divideTime = openingHours / moreWorkers ;




        System.out.println("Всего работников в компании - " + worker + " человек");
        System.out.println("Если в компании работает " + moreWorkers + " человек, то всего по " + divideTime + " часа работы может быть поделено между сотрудниками");



    }
}