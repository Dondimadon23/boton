package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		   Scanner in=new Scanner(System.in);
		   int op=0;
		   ArrayList<Alumno>listaAlumnos=new ArrayList<Alumno>();
		   do{
		   
		     System.out.println("1.agregar alumno");
		     System.out.println("2.Ver Alumnos");
		     System.out.println("3.Salir");
		     op=in.nextInt();
		     switch(op){
		       case 1:
		       in.nextLine();
		       System.out.println("Numero de Control");
		       String NumControl=in.nextLine();
		       System.out.println("Nombre");
		       String Nom=in.nextLine();
		       System.out.println("Ap");
		       String Ap=in.nextLine();
		       System.out.println("Am");
		       String Am=in.nextLine();
		       System.out.println("grupo");
		       String Grupo=in.nextLine();
		       System.out.println("carrera");
		       String Carrera=in.nextLine();
		       System.out.println("turno");
		       String Turno=in.nextLine();
		       Alumno x=new Alumno();
		       x.setNumControl(NumControl);
		       x.setNom(Nom);
		       x.setAp(Ap);
		       x.setAm(Am);
		       x.setGrupo(Grupo);
		       x.setCarrera(Carrera);
		       x.setTurno(Turno);
		       listaAlumnos.add(x);
		       break ;
		       case 2:
		       
		       for (Alumno a:listaAlumnos){
		       a.tuString();
		       }
		       break;
		       }
		       }while(op!=3);
		       }
		       }