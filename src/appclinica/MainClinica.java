
package appclinica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.util.Scanner;

public class MainClinica {

    public static void main(String[] args) {
        // Crear instancias necesarias

        Scanner scanner = new Scanner(System.in);
            
        //Agregamos varios laboratorios de prueba
        
        
        Laboratorio lab1=new Laboratorio("1", "Quifarma");
        Laboratorio lab2=new Laboratorio("2", "MK");
        Laboratorio lab3=new Laboratorio("3", "Genfar");
        
        Laboratorio.ListaLaboratorios.agregarAlFinal(lab1);
        Laboratorio.ListaLaboratorios.agregarAlFinal(lab2);
        Laboratorio.ListaLaboratorios.agregarAlFinal(lab3);
        
        //Compañia aseguradora particular por defecto
        
        CompaniaAseguradora.ListaCompañias.agregarAlFinal(new CompaniaAseguradora("Particular", "XXX", "XXX"));
        
        
        //Agregamos medicaciones de prueba
        Medicacion.ListaMedicacion.agregarAlFinal(new Medicacion(1, "Paracetamol", 500, 7));
        Medicacion.ListaMedicacion.agregarAlFinal(new Medicacion(2, "Ibuprofeno", 200, 5));
        Medicacion.ListaMedicacion.agregarAlFinal(new Medicacion(3, "Amoxicilina", 250, 10));
        Medicacion.ListaMedicacion.agregarAlFinal(new Medicacion(4, "Omeprazol", 20, 14));
        Medicacion.ListaMedicacion.agregarAlFinal(new Medicacion(5, "Aspirina", 100, 3));
        
        CompaniaAseguradora na=new CompaniaAseguradora("SURA","543255","adfhdsh");
        CompaniaAseguradora.ListaCompañias.agregarAlFinal(na);
        Paciente pa=new Paciente("1037607646", "Cristian", "Londoño", "Dom1", "M", "10-091990", na);
        Paciente.getListaPacientes().agregarAlFinal(pa);
  
        
        // Menú principal
        int opcion;
        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Registrar compañía aseguradora");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Asignar cita a paciente");
            System.out.println("4. Atender consulta");
            System.out.println("5. Generar factura");
            System.out.println("6. Mostrar información de paciente");
            System.out.println("7. Mostrar información de compañía aseguradora");
            System.out.println("8. Mostrar remesas de facturación");
            System.out.println("9. Consultar Historia medica por paciente");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Registrar compañía aseguradora
                    registrarCompaniaAseguradora();
                   
                    break;
                case 2:
                    // Registrar paciente
                    registrarPaciente();
                    break;
                case 3:
                    // Asignar consulta a paciente
                    asignarConsulta();
                    break;
                case 4:
                    // Atender consulta
                    atenderConsulta();
                    break;
                case 5:
                    // Generar factura
                    generarFactura();
                    break;
                case 6:
                    // Mostrar información de paciente
                    mostrarInfoPaciente();
                    break;
                case 7:
                    // Mostrar información de compañía aseguradora
                    mostrarInfoCompania();
                    break;
                case 8:
                    // Mostrar remesas de facturación
                    mostrarRemesas();
                    break;
                case 9:
                        
                    MostrarHistoria();
                case 10:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 9);

        // Cerrar scanner al salir
        scanner.close();
    }

    private static void registrarPaciente() {
        
        String Id;
        String Nombre;
        String apellidos;
        String domicilio="";
        String Sexo;
        String FechaNAcimient;
        CompaniaAseguradora Aseguradora=null;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite el Id del paciente");
        Id=entrada.next();

        System.out.println("Digite el nombre del paciente");
        Nombre=entrada.next();        
        
        System.out.println("Digite los apellidos del paciente");
        apellidos=entrada.next();
        
        System.out.println("Digite el sexo del paciente M/F");
        Sexo=entrada.next();
        
        System.out.println("Digite la fecha de nacimiento del paciente");
        FechaNAcimient=entrada.next();
        
        System.out.println("Seleccione la compañia aseguradora del paciente");
        
        int i=1;
        int icompania;
        
        for (CompaniaAseguradora compania : CompaniaAseguradora.ListaCompañias) {
            // Haz algo con cada compañía
            System.out.println("(" + i + ")" + compania.getNombre());
            i++;
            
        }
        
        icompania=entrada.nextInt();
        i=1;
        for (CompaniaAseguradora compania : CompaniaAseguradora.ListaCompañias) {
            // Haz algo con cada compañía
            if(i==icompania){
                Aseguradora=compania;
            }
            i++;
            
        }
        
        
        Paciente.getListaPacientes().agregarAlFinal(new Paciente(Id,Nombre,apellidos,domicilio,Sexo,FechaNAcimient,Aseguradora));
        
        System.out.println("Paciente agregado con éxito");
        
    }

    private static void registrarCompaniaAseguradora() {
        
        String nombre;
        String cif;
        String domicilioSocial;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite el nombre de la compañia aseguradora");
        nombre=entrada.next();

        System.out.println("Digite el cif de la compañia aseguradora");
        cif=entrada.next();        
        
        System.out.println("Digite el domicilio de la aseguradora");
        domicilioSocial=entrada.next();
        

        CompaniaAseguradora.getListaCompañias().agregarAlFinal(new CompaniaAseguradora(nombre,cif,domicilioSocial));
        
        System.out.println("Compañia aseguradora agregado con éxito");        
    }

    private static void asignarConsulta() {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha y hora al usuario
        System.out.print("Ingrese la fecha y hora (en el formato yyyy-MM-dd HH:mm): ");
        String fechaHoraStr = scanner.nextLine();

        // Convertir la cadena a LocalDateTime

       LocalDateTime fechaHora = null; 
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            fechaHora = LocalDateTime.parse(fechaHoraStr, formato);
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha y hora. Asegúrese de ingresar el formato correcto.");
            return;
        }
        
        System.out.println("Seleccione el Id del paciente");
        
        int i=1;
        int iPaciente;
        
        for (Paciente p : Paciente.getListaPacientes()) {
            // Haz algo con cada compañía
            System.out.println( "(" + i +") " + p.getDni() + " " + p.getNombre());
            i++;
            
        }
        
        iPaciente=scanner.nextInt();
        i=1;
        Paciente paciente=null;
        
        for (Paciente p : Paciente.getListaPacientes()) {
            // Haz algo con cada compañía
            if(i==iPaciente){
                paciente=p;
            }
            i++;
            
        }
        
        System.out.println("Seleccione el tipo de cita 1 para normal ó 2 para urgencia");
        int urgencia=scanner.nextInt();
        
        Cita.id++;
        Cita lacita=new Cita(fechaHora,paciente,(urgencia==1) ? false : true);
        lacita.setAtendido(false);
        Cita.ListaCitas.agregarAlFinal(lacita);
        
        
        System.out.println("Se ha creado la siguiente cita: \n"
                + lacita.toString() );
        
        
        
    }

    private static void atenderConsulta() {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha y hora al usuario
        System.out.println("Digite el codigo de la cita");
        int Cod = scanner.nextInt();
        
        int i=1;
  
        Cita Lacita=null;
        for (Cita c : Cita.ListaCitas) {
           
            if(c.getCodCita()==Cod){
               Lacita =c;
            }
      
            
        }
        
        if(Lacita==null){
            
           System.out.print("La cita no existe");
           return;
            
        }
        if(Lacita.isAtendido()){
           System.out.print("La cita ya fue atendida");
           return;            
        }
        
        System.out.print("Ingrese el tipo de consulta (NUEVA, REVISION, CONTROL): ");
        String tipoConsultaStr = scanner.next();

        // Convertir la cadena a TipoConsulta
        TipoConsulta tipoConsulta;

        try {
            tipoConsulta = TipoConsulta.valueOf(tipoConsultaStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Tipo de consulta inválido.");
            return;
        }
        
        System.out.println("Digite el diagnostico brevemente");
        String diangostico=scanner.next();
        
        
        
        
        i=1;
        
        
        for (Medicacion l : Medicacion.ListaMedicacion) {
            // Haz algo con cada compañía
            System.out.println( "(" + i +") " + l.getDenominacion() + " Dosis: " + l.getDosis() + " Duración: " + l.getDuracion());
            i++;
            
        }
        System.out.println("Seleccione el Id de la medicación");
        Integer iMedicacion=scanner.nextInt();
        i=1;
        
        Medicacion Lamedicacion=null;
        
        for (Medicacion l : Medicacion.ListaMedicacion) {
            // Haz algo con cada compañía
            if(i==iMedicacion){
                Lamedicacion=l;
            }
            i++;
            
        }

        System.out.println("Seleccione el Id del laboratorio");
        
        i=1;
        int ilaboratorio;
        
        for (Laboratorio l : Laboratorio.ListaLaboratorios) {
            // Haz algo con cada compañía
            System.out.println( "(" + i +") " + l.getCodigo() + " " + l.getNombre());
            i++;
            
        }
        
        ilaboratorio=scanner.nextInt();
        i=1;
        
        Laboratorio elLaboratorio=null;
        
        for (Laboratorio l : Laboratorio.ListaLaboratorios) {
            // Haz algo con cada compañía
            if(i==ilaboratorio){
                elLaboratorio=l;
            }
            i++;
            
        }
        
        Lacita.setAtendido(true);
        Consulta.numeroConsulta++;
        Consulta lc=new Consulta(tipoConsulta,diangostico,Lamedicacion,elLaboratorio,Lacita);
        Historial.consultas.agregarAlFinal(lc);
        Consulta.ListaConsultas.agregarAlFinal(lc);
        
        System.out.println("Cita atendida con exito \n" + lc.toString());
        
    }

    private static void generarFactura() {

       Scanner entrada =new Scanner(System.in);
        
       
       System.out.println("Digite el codigo de la consulta");
       
       int cod=entrada.nextInt();
       
       
       
        int i=1;
        for (Consulta lc : Consulta.ListaConsultas) {
            // Haz algo con cada compañía
            System.out.println( "(" + i +") " + lc.getCodConsulta() + " Cod cita: " + lc.getCita().getCodCita() + " Diagnostico: " + lc.getDiagnostico());
            i++;
            
        }
        
        int icon=entrada.nextInt();
        i=1;
        

        Consulta c=null;
        for (Consulta lc : Consulta.ListaConsultas) {
            // Haz algo con cada compañía
            if(i==icon){
                c=lc;
            }
            i++;
            
        }
       
       if(c.getFactura()==null){
           System.out.println("La consulta ya fue facturada");
       }
       
       
       System.out.println("Digite el valor para la factura");
       Double importe=entrada.nextDouble();
       
       //Si la consulta es particular se incrementa el valor del importe un 2%
       if(c.getCita().getNombrePaciente().getCompaniaAseguradora().getNombre().equals("Particular")){
           importe+=(importe*0.02);
       }
       
       Factura.idfactura++;
       
       Factura lfac=new Factura(importe,c.getCita().getNombrePaciente().getCompaniaAseguradora());
       
       Factura.ListaFacturas.agregarAlFinal(lfac);
       
       RemesaFacturacion rm=new RemesaFacturacion(lfac);
       RemesaFacturacion.ListaRemesasFacturacion.agregarAlFinal(rm);
       
       System.out.println("Consulta Facturada con éxito \n "  + lfac.toString());
        
    }

    private static void mostrarInfoPaciente() {
        
        for(Paciente p:Paciente.getListaPacientes()){
            System.out.println(p.toString());
        }
        
    }

    private static void mostrarInfoCompania() {
        
        for(CompaniaAseguradora c: CompaniaAseguradora.ListaCompañias){
            System.out.println(c.toString());
        }
        
    }

    private static void mostrarRemesas() {
        for(RemesaFacturacion r: RemesaFacturacion.ListaRemesasFacturacion){
            System.out.println(r.toString());
        }
    }
    
    
    private static void MostrarHistoria(){
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Seleccione el Id del paciente");
        
        int i=1;
        int iPaciente;
        
        for (Paciente p : Paciente.getListaPacientes()) {
            // Haz algo con cada compañía
            System.out.println( "(" + i +") " + p.getDni() + " " + p.getNombre());
            i++;
            
        }
        
        iPaciente=scanner.nextInt();
        i=1;
        Paciente paciente=null;
        
        for (Paciente p : Paciente.getListaPacientes()) {
            // Haz algo con cada compañía
            if(i==iPaciente){
                paciente=p;
            }
            i++;
            
        }
        
        
        for(Consulta h:Historial.consultas){
            if(h.getCita().getNombrePaciente().getDni()==paciente.getDni()){
                System.out.println(h.toString());
            }
        }
        
    }
}

