package fr.pala.accounting.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Getter
@Setter
public class TransactionModel {

    @Id
    private String transaction_id;
    private String type;
    private String shop_name;
    private String shop_address;
    private Date date;
    private Float amount;
    private String description;

    public TransactionModel(String transaction_id, String type, String shop_name, String shop_address, Date date, Float amount, String description){
        this.transaction_id = transaction_id;
        this.type = type;
        this.shop_name = shop_name;
        this.shop_address = shop_address;
        this.date = date;
        this.amount = amount;
        this.description = description;

    }

}
