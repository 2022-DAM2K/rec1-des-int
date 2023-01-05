package org.iesfm.examen.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    private Integer number;
    private String cardType;
    private int cvv;
    private String ownerName;
}
