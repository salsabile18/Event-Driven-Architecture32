package ma.enset.comptecqrses.query.controllers;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class GetAccountByIdQuery {
    private String id;
    public GetAccountByIdQuery(String id){

    }
}
