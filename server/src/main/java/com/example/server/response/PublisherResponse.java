package com.example.server.response;

import com.example.server.entity.PublisherEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PublisherResponse extends BaseResponse {
public PublisherResponse(boolean success, String message, PublisherEntity publisher){
    super(success, message);
    this.publisher=publisher;
}
public PublisherResponse(PublisherEntity publisher){super(true,"Publishing data");}
    private PublisherEntity publisher;
}
