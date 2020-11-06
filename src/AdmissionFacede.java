public class AdmissionFacede {
    Test test;
    Documents documents;
    Consultant isConsultant;
    Consultant csConsultant;
    Consultant engConsultant;

    public AdmissionFacede(Test test, Documents documents, Consultant isConsultant, Consultant csConsultant, Consultant engConsultant) {
        this.test = test;
        this.documents = documents;
        this.isConsultant = isConsultant;
        this.csConsultant = csConsultant;
        this.engConsultant = engConsultant;
    }

    public void consultation(){
        isConsultant.giveAdvice();
    }
    public void setDocuments(){
        documents.submitDocs();
        documents.checkDocuments();
    }

    public void setCertificate(Integer id){
        documents.submitCertificate(id,test);
    }
    public void passEngTest() {
        documents.checkDocuments();
        documents.checkInternationalCertificates();
        if (!test.getTestEng()){
            if (documents.getSubmitDocs()){
                test.passTestEng();
                return; }}
        else{
                System.out.println("You has certificate or passed exam before)");
            return;}
        System.out.println("You didnt pass docs.");;
    }

    public void passSpecExam(){
        documents.checkDocuments();
        if (documents.getSubmitDocs()){
            test.passTestSpec();
            return;
    }
        System.out.println("You didnt pass docs.");;
    }

    public void passKazExam(){
        documents.checkDocuments();
        if (documents.getSubmitDocs()){
            test.passTestKaz();
            return;
        }
        System.out.println("You didnt pass docs.");;
    }

}
