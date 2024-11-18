package es.codegym.task.pro.task11.task1103;

/* 
presentación de robots
*/

public class Robot {

    public static int robotCounter;

    public int id;

    public  String model;

    public  int productionYear;

    public static String vendor = "CodeGym Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("I am robot %d of %d. Model: %s. I was manufactured by %s in year %d.\n",
                 id, robotCounter, model, vendor, productionYear);
    }
}
