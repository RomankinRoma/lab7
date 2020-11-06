public class Documents {
    private Boolean submitDocs;
    private Boolean submitIELTS;
    private Boolean submitTOEFL;

    public Documents() {
    }

    public Documents(Boolean submitDocs, Boolean submitIELTS, Boolean submitTOEFL) {
        this.submitDocs = submitDocs;
        this.submitIELTS = submitIELTS;
        this.submitTOEFL = submitTOEFL;
    }

    public void submitDocs(){
        submitDocs=true;
        System.out.println("Docs submitted.");
    }

    public void submitCertificate(Integer chose,Test test) {
        if (chose == 1){
            submitIELTS = true;
        test.setTestEng(true);}
        if (chose == 2){
            submitTOEFL = true;
        test.setTestEng(true);
    }
    }

    public void checkDocuments(){
        if (submitDocs)
            System.out.println("Docs submitted.");
    }

    public void checkInternationalCertificates(){
        if (submitIELTS || submitTOEFL)
            System.out.println("Has certificate");
    }

    public Boolean getSubmitDocs() {
        return submitDocs;
    }

    public void setSubmitDocs(Boolean submitDocs) {
        this.submitDocs = submitDocs;
    }

    public Boolean getSubmitIELTS() {
        return submitIELTS;
    }

    public void setSubmitIELTS(Boolean submitIELTS) {
        this.submitIELTS = submitIELTS;
    }

    public Boolean getSubmitTOEFL() {
        return submitTOEFL;
    }

    public void setSubmitTOEFL(Boolean submitTOEFL) {
        this.submitTOEFL = submitTOEFL;
    }
}
