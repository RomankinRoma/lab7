public class ISConsultant extends Consultant {
    @Override
    public void giveAdvice() {
        System.out.println("IS advice given");
        if (Consultant!=null)
            Consultant.giveAdvice();
    }
}
