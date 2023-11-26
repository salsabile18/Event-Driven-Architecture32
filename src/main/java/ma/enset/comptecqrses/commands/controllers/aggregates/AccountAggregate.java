package ma.enset.comptecqrses.commands.controllers.aggregates;


<<<<<<< HEAD
import ma.enset.comptecqrses.commands.controllers.AccountCommandController;
import ma.enset.comptecqrses.commonapi.commands.CreateAccountCommand;
import ma.enset.comptecqrses.commonapi.commands.CreditAccountCommand;
import ma.enset.comptecqrses.commonapi.commands.DebitAccountCommand;
import ma.enset.comptecqrses.commonapi.enums.AccountStatus;
import ma.enset.comptecqrses.commonapi.events.AccountActivatedEvent;
import ma.enset.comptecqrses.commonapi.events.AccountCreatedEvent;
import ma.enset.comptecqrses.commonapi.events.AccountCreditedEvent;
import ma.enset.comptecqrses.commonapi.events.AccountDebitedEvent;
import ma.enset.comptecqrses.commonapi.exceptions.AmountNegativeException;
import ma.enset.comptecqrses.commonapi.exceptions.BalanceNotSufficientException;
=======
import ma.enset.comptecqrses.commonapi.commands.CreateAccountCommand;
import ma.enset.comptecqrses.commonapi.enums.AccountStatus;
import ma.enset.comptecqrses.commonapi.events.AccountActivatedEvent;
import ma.enset.comptecqrses.commonapi.events.AccountCreatedEvent;
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class AccountAggregate {


    @AggregateIdentifier
    private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;


    public AccountAggregate() {
        //required by AXON
    }


    @CommandHandler
    public AccountAggregate(CreateAccountCommand createAccountCommand) {
        if(createAccountCommand.getInitialBalance()<0) throw new RuntimeException("Impossible ...");
        //OK
        AggregateLifecycle.apply(new AccountCreatedEvent(
                createAccountCommand.getId(),
                createAccountCommand.getInitialBalance(),
<<<<<<< HEAD
                createAccountCommand.getCurrency(),
                AccountStatus.CREATED));
=======
                createAccountCommand.getCurrency()
        ));
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158
    }


    @EventSourcingHandler
    public void on(AccountCreatedEvent event){
         this.accountId= event.getId();
         this.balance= event.getInitialBalance();
         this.currency= event.getCurrency();
         this.status=AccountStatus.CREATED;
         AggregateLifecycle.apply(new AccountActivatedEvent(
                 event.getId(),
<<<<<<< HEAD
                 AccountStatus.ACTIVATED));
=======
                 AccountStatus.ACTIVATED
         ));
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158
    }
    @EventSourcingHandler
    public void on(AccountActivatedEvent event){
        this.status=event.getStatus();
    }
<<<<<<< HEAD

    @CommandHandler
    public void handle(CreditAccountCommand command){
        if(command.getAmount()<0) throw new AmountNegativeException("Amount should not be negative ");
        AggregateLifecycle.apply(new AccountCreditedEvent(
              command.getId(),
                command.getAmount(),
                command.getCurrency()
        ));
    }

    @EventSourcingHandler
    public  void on(AccountCreditedEvent event){
        this.balance+=event.getAmount();
    }

    @CommandHandler
    public void handle(DebitAccountCommand command){
        if(command.getAmount()<0) throw new AmountNegativeException("Amount should not be negative ");
        if(this.balance< command.getAmount()) throw new BalanceNotSufficientException("Balance not sufficient Exception =>"+balance);
        AggregateLifecycle.apply(new AccountDebitedEvent(
                command.getId(),
                command.getAmount(),
                command.getCurrency()
        ));
    }

    @EventSourcingHandler
    public  void on(AccountDebitedEvent event){
        this.balance+=event.getAmount();
    }
=======
>>>>>>> f1b6456d203d210715198235e67fc7f98cda7158
}
