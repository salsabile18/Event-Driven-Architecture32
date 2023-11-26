package ma.enset.comptecqrses.commonapi.events;

import lombok.Getter;
<<<<<<< HEAD
import ma.enset.comptecqrses.commonapi.enums.AccountStatus;
=======
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158

public class AccountCreatedEvent extends BaseEvent<String> {
    @Getter private double initialBalance;
    @Getter private String currency;
<<<<<<< HEAD
    @Getter private AccountStatus status;

    public AccountCreatedEvent(String id, double initialBalance, String currency, AccountStatus created) {
=======

    public AccountCreatedEvent(String id, double initialBalance, String currency) {
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
    }


}
