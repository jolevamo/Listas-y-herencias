package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        /*ArrayList<Integer> data = new ArrayList();
        data.add(7);
        data.add(5);
        data.add(0,8);
        System.out.println(data.get(2));*/
        //Herencia
        //Se crea el arreglo dinamico
        List<Monitor> monitores = new ArrayList();
        //Se crea el objeto
        Monitor monitor = new Monitor();
        //Se capturan los valores para los campos:
        String i= "Si";
        while (i.equals("Si") ||i.equals("si")||i.equals("SI")){
            System.out.println("Ingrese marca: ");
            monitor.setBrand(inputData.nextLine());
            System.out.println("Ingrese nombre: ");
            monitor.setName(inputData.nextLine());
            System.out.println("Ingrese referencia: ");
            monitor.setReference(inputData.nextLine());
            System.out.println("Ingrese tamaño pantalla: ");
            monitor.setScreenSize(inputData.nextLine());
            System.out.println("Ingrese resolución: ");
            monitor.setResolution(inputData.nextLine());
            monitores.add(monitor);
            System.out.println("Desea agregar otro monitor (Si o no):");
            i = inputData.nextLine();
        }


    }
}
