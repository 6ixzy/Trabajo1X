package com.seis.atm.empty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cliente 
{
    @id 
    @GeneratedValue{strategy = generationType.IDENTITY}
    private long id;
    private String nombre;
    @Column{unique = true}
    private String identificacion ;
    private String pin;
    private boolean bloqueado;
    private int intentosFallidos;
    @OnetoMany{mappedBy = "Cliente", cascade = CascadeType.ALL}
    private List<cuenta> cuentas;

}
