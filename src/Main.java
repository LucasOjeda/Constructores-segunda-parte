import javax.swing.JOptionPane;
public class Main {
public static void main (String []args){
Persona p1 = new Persona ("Pablo",26,"Betharram 3560","Soltero",36644864);  
   JOptionPane.showMessageDialog(null,"Nombre: "+p1.nombre+"\nEdad: "+p1.edad+"\nDomicilio: "+p1.domicilio+"\nEstado Civil: "+p1.eCivil+"\nDni: "+p1.dni);
Persona p2 = new Persona ("Ramiro",32,"","Casado",27644864);  
     JOptionPane.showMessageDialog(null,"Nombre: "+p2.nombre+"\nEdad: "+p2.edad+"\nDomicilio: "+p2.domicilio+"\nEstado Civil: "+p2.eCivil+"\nDni: "+p2.dni);
Persona p3 = new Persona ("Pamela",28,"Corrientes 124","Soltera",34644844);  
  JOptionPane.showMessageDialog(null,"Nombre: "+p3.nombre+"\nEdad: "+p3.edad+"\nDomicilio: "+p3.domicilio+"\nEstado Civil: "+p3.eCivil+"\nDni: "+p3.dni);
Persona p4 = new Persona ("Carolina",22,"Urquiza 2020","Soltero",38645564);  
    JOptionPane.showMessageDialog(null,"Nombre: "+p4.nombre+"\nEdad: "+p4.edad+"\nDomicilio: "+p4.domicilio+"\nEstado Civil: "+p4.eCivil+"\nDni: "+p4.dni);
Persona p5 = new Persona ("Ariel",33,"Callao 2323","Divorciado",30644822);  
  JOptionPane.showMessageDialog(null,"Nombre: "+p5.nombre+"\nEdad: "+p5.edad+"\nDomicilio: "+p5.domicilio+"\nEstado Civil: "+p5.eCivil+"\nDni: "+p5.dni);
}
}
