public class CSConsultant extends Consultant {
    @Override
    public void giveAdvice() {
        System.out.println("CS advice given");
        if (Consultant!=null)
            Consultant.giveAdvice();
    }

}
