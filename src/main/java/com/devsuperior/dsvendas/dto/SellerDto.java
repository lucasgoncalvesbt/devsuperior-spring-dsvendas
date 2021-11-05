package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDto(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }

    public static List<SellerDto> convertToDtoList(List<Seller> sellers) {
        return sellers.stream().map(SellerDto::new).collect(Collectors.toList());
    }
}
