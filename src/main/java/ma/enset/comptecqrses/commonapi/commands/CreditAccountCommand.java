package ma.enset.comptecqrses.commonapi.commands;

<<<<<<< HEAD
import lombok.Getter;

public class CreditAccountCommand extends BaseCommand<String>{


    @Getter private double amount;
    @Getter private String currency;
=======
public class CreditAccountCommand extends BaseCommand<String>{


    private double amount;
    private String currency;
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158
    public CreditAccountCommand(String id, double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
