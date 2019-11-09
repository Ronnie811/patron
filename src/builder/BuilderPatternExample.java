package builder;

public class BuilderPatternExample {

    public static void main(String[] args) {

        BankAccountBuilder builder = new BankAccountBuilder(12345l);

        BankAccount bankAccount = builder.withBalance(1000.20)
                .withOwner("Oaken")
                .withRate(10.15)
                .withType(BankAccountType.PLATINUM)
                .build();

        System.out.println("Numero Cuenta: "+bankAccount.getAccountNumber()+"\n"+
                "Propietario de la Cuenta: "+bankAccount.getOwner()+"\n"+
                "Tipo: "+bankAccount.getType()+"\n"+
                "Balance: "+bankAccount.getBalance()+"\n"+
                "Tasa de interés: "+bankAccount.getInterestRate());
    }
}
