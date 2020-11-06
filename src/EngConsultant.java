public class EngConsultant extends Consultant{
    @Override
    public void giveAdvice() {
        System.out.println("Eng advice given");
        if (Consultant!=null)
            Consultant.giveAdvice();
    }
}
