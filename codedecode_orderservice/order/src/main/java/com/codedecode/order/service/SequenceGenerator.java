package com.codedecode.order.service;

import com.codedecode.order.entity.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Query;


import static org.springframework.data.mongodb.core.query.Query.query;


@Service
public class SequenceGenerator {

    @Autowired
    private MongoOperations mongoOperations;

    private static final int sequence = 1; // Define the ID for the sequence document


    public int generateNextOrderId() {
        //to generate the next order_id, we have to save the previous order_id in some document.
        //so in ENTITY package, we have to create a class as SEQUENCE, this class is saved as MONGO_DOCUMENT
        Query query = new Query(Criteria.where("_id").is(sequence)); //document_name
        Update update = new Update().inc("sequence", 1); //get the key sequence & increment by 1
        FindAndModifyOptions options = new FindAndModifyOptions().returnNew(true).upsert(true); //
        Sequence counter = mongoOperations.findAndModify((org.springframework.data.mongodb.core.query.Query) query, update, options, Sequence.class);

        return counter.getSequence();
    }

}
