package ma.enset.comptecqrses.query.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.comptecqrses.commonapi.enums.AccountStatus;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.hibernate.sql.ast.tree.expression.Collation;

import javax.persistence.Id;
import java.util.Collection;



@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Account {
    @Id
    private String id;
    private double balance;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private String currency;
    @OneToMany
    private Collection<Operation> operations;
}
