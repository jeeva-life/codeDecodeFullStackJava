package com.codedecode.foodcatalogue.dto;

import com.codedecode.foodcatalogue.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;

// THIS PAGE IS RESPONSIBLE FOR SHOWING ALL FOOD ITEMS LIST AND RESTAURANT DETAILS AT FRONT END
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCataloguePage {
    private List<FoodItem> foodItemList;
    private Restaurant restaurant;
}
