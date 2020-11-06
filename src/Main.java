import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Test test=new Test(false,false,false);
        Documents documents= new Documents(false,false,false);
        Consultant isConsultant = new ISConsultant();
        Consultant csConsultant = new CSConsultant();
        Consultant engConsultant = new EngConsultant();

        isConsultant.setConsultant(csConsultant);
        csConsultant.setConsultant(engConsultant);

        AdmissionFacede admissionFacede=new AdmissionFacede(test,documents,isConsultant,csConsultant,engConsultant);

        admissionFacede.consultation();
        admissionFacede.setDocuments();
        System.out.println("1.IELTS");
        System.out.println("2.TOELF");
        System.out.println("0.Exit");
        Integer chose=in.nextInt();
        admissionFacede.setCertificate(chose);
        admissionFacede.passEngTest();
        admissionFacede.passKazExam();
        admissionFacede.passSpecExam();
    }
}
